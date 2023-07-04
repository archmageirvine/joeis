package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionSequence;

/**
 * A006019 Remoteness number of n in Simon Norton's game of Tribulations.
 * @author R. J. Mathar
 * @author Sean A. Irvine
 */
public class A006019 extends MemoryFunctionSequence<Z, Integer> {
  /*
   * P-Positions: previous  player wins.
   * Positions with mEven-valued remoteness.
   */
  private static final byte PPOS = 1;

  /*
   * N-Positions: next player wins.
   * Positions with odd-valued remoteness.
   */
  private static final byte NPOS = 0;

  /*
   * U-Positions: unknown whether the number of beans is a
   * winning or losing case.
   */
  private static final byte UPOS = -1;

  /*
   * The n-th triangular number.
   *
   * @param n The non-negative index.
   * @return n*(n+1)/2 .
   */
  private static Z a000217(final Z n) {
    return n.multiply(n.add(Z.ONE)).shiftRight(1);
  }

  /*
   * Largest triangular number not greater than n
   * @param n The upper limit on the resulting triangular number.
   */
  private static Z a057944(final Z n) {
    // Search all k>=0 and compute k(k+1)/2. As soon as this value
    // exceeds n, return the triangular number for the k-value just before
    for (Z k = Z.ONE; ; k = k.add(Z.ONE)) {
      if (a000217(k).compareTo(n) > 0) {
        return a000217(k.subtract(Z.ONE));
      }
    }
  }

  /*
   * Parity of the remoteness of n
   *
   * @param depth The depth of searching the binary tree of the moves.
   * The larger this parameter, the more likely one of the leaves
   * of the search tree will be able to figure out whether the
   * n is associated with a winning N-state or a losing P-state.
   * @return The parity if a search down the moves-tree to depth yields a result
   * Returns UPOS if undecided up to that search depth.
   */
  private byte parity(final Z n, final int depth) {
    if (n.compareTo(Z.ZERO) == 0) {
      // even parity
      return PPOS;
    } else {
      // try to look up the result in the history of older computations to minimize the effort of
      // the recursive calculations.
      final Integer r = getUncached(n);
      if (r != null) {
        // if this parity is mEven, a P-position (losing), if it is odd, a N-position (winning).
        return (r % 2 == 0) ? PPOS : NPOS;
      }

      // the remoteness if n is a triangular value is +1
      for (Z k = Z.ZERO; ; k = k.add(Z.ONE)) {
        final Z t = a000217(k);
        if (t.compareTo(n) == 0) {
          // odd parity
          return NPOS;
        } else if (t.compareTo(n) > 0) {
          break;
        }
      }

      // exhausted the depth-search through the binary tree of moves: return that the value is unknown
      if (depth < 1) {
        return UPOS;
      }
      // construct the stack sizes for both possible moves (tak and put) and call recursively for
      // their associated parities
      final Z tak = n.subtract(a057944(n));
      final byte partak = parity(tak, depth - 1);

      final Z put = n.add(a057944(n));
      final byte parput = parity(put, depth - 1);

      if (parput != UPOS && partak != UPOS) {
        // this case that both choices have a known parity value...
        if (parput == partak) {
          // if both parities after the two moves are the same, this parity here is the opposite of each.
          return (parput == NPOS) ? PPOS : NPOS;
        } else {
          // the two parities are different and known: the player has a choice and selects the NPOS to win.
          return NPOS;
        }
      } else if (parput == PPOS || partak == PPOS) {
    /* One of the parities after the moves
    * is not known; we have only partial parity information,
    * but one of is known to put the next player in a P-position.
    * So from the view of this player this is the winning strategy.
    * Also not evaluating the unknown parity further is equivalent
    * to take a winning strategy with a minimum number of moves.
    */
        return NPOS;
      } else {
    /* this here means either at least one of the moves leads
    * to an undecided position and the other (if known) leads
    * to a winning position of the next player. Because the
    * strategy is to choose the longer game if we are to lose,
    * we delay the decision (by saying there is none) assuming that
    * taking the (yet unknown) branch may be a better choice.
    */
        return UPOS;
      }
    }
  }

  @Override
  public Integer compute(final Z n) {
    int remoteness = -1;
    if (n.isZero()) {
      // No beans means the previous player has won.
      remoteness = 0;
    } else {
      // The remoteness at triangular numbers are +1
      for (Z k = Z.ZERO; ; k = k.add(Z.ONE)) {
        final Z t = a000217(k);
        if (t.compareTo(n) == 0) {
          remoteness = 1;
        } else if (t.compareTo(n) > 0) {
          break;
        }
      }

      if (remoteness < 0) {
        // Construct the number of beans in the two possible next moves
        final Z tak = n.subtract(a057944(n));
        final Z put = n.add(a057944(n));
        // Recursive search up to some depth (increasing) for a move that makes n a N-position.
        for (int depth = 1; ; depth++) {
          // The two parities of the two possible moves.
          // One or both may be undecided if the depth is not deep enough.
          final byte partak = parity(tak, depth);
          final byte parput = parity(put, depth);

          // We have 9 possible pairs of (partak,parput), one or both
          // being PPOS, NPOS or UPOS. This scenario is evaluated with the
          // strategy to grab a winning move as soon as possible and to delay a
          // losing move as long as possible.
          if (partak == PPOS) {
            if (parput != PPOS) {
              // Taking would lead to a P-position of the opponent, putting not or unknown
              // Game strategy is to take the shortest path towards winning
              remoteness = 1 + get(tak);
            } else {
              // Taking and putting give both P-position of the opponent.
              // Strategy is to select fastest game (game with smallest number of moves)
              remoteness = 1 + Math.min(get(put), get(tak));
            }

          } else if (parput == PPOS) {
            // Putting gives a P-position of the opponent, and
            // taking gives an N-position or undecided. Strategy is to
            // leave a P-position to the opponent.
            remoteness = 1 + get(put);
          } else if (parput == NPOS) {
            if (partak == NPOS) {
              // Taking or putting both give N-position. Select slowest game, because we're losing.
              remoteness = 1 + Math.max(get(put), get(tak));
            } else {
              // Putting gives N-position and taking is unknown:
              //select slowest game, which is the unknown branch
              //because we are increasing the search depth in the outer loop
              remoteness = 1 + get(tak);
            }
          }

          // Note there is no else-branch here that deals with the effect
          // of having two UPOS-values in partak and parput. This is left over
          // to the next loop with deeper search.
          if (remoteness >= 0) {
            break;
          }
        }
      }
    }
    return remoteness;
  }

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.valueOf(get(mN));
  }
}
