package irvine.math.group;

import java.util.ArrayList;
import java.util.List;

/**
 * Natural generators and maximal-subgroup coverage for Sp(6,2).
 * @author Gregory Morse
 */
final class BinarySymplecticSeeds {

  private BinarySymplecticSeeds() { }

  // ATLAS of Finite Group Representations, Sp(6,2), natural action.
  // https://brauer.maths.qmul.ac.uk/Atlas/v3/clas/S62/
  private static final long[] GENERATORS = {37852311618L, 25237160324L};
  private static final int[][][] WORDS = {
    {{1, 2, 1, 3}, {2, 4, 2, 4}, {1, 3, 4, 2}},
    {{1, 2, 1, 3}, {2, 3, 2, 4}, {1, 3, 4, 2}},
    {{1, 1, 2, 3}, {1, 3, 2, 4}, {1, 4, 2, 5}, {1, 5, 2, 6}, {1, 6, 2, 5}, {1, 5, 4, 1}, {1, 2, 6, 4}, {1, 4, 3, 2}},
    {{1, 1, 2, 3}, {1, 3, 2, 4}, {1, 4, 3, 5}, {1, 4, 2, 3}, {1, 5, 3, 4}, {1, 3, 2, 5}, {1, 5, 1, 3}, {1, 4, 3, 1}},
    {{1, 1, 2, 3}, {1, 3, 2, 4}, {1, 2, 3, 5}, {1, 4, 2, 3}, {1, 3, 2, 1}, {1, 5, 1, 3}, {1, 1, 2, 5}, {1, 3, 5, 2}, {1, 5, 4, 1}},
    {{1, 1, 2, 3}, {1, 3, 2, 4}, {2, 3, 4, 1}, {1, 4, 2, 5}, {1, 5, 5, 4}, {1, 4, 3, 5}, {2, 3, 3, 4}, {1, 4, 5, 2}},
    {{1, 1, 2, 3}, {1, 3, 2, 4}, {1, 2, 4, 1}, {1, 4, 2, 5}, {1, 5, 3, 6}, {1, 5, 2, 3}, {1, 1, 6, 5}, {1, 3, 2, 6}, {1, 6, 4, 1}, {1, 5, 3, 2}},
    {{1, 1, 2, 3}, {1, 3, 2, 4}, {1, 3, 4, 5}, {1, 5, 5, 3}, {1, 4, 2, 5}, {1, 5, 1, 4}, {1, 3, 4, 5}, {3, 2, 3}, {1, 3, 1, 4}, {1, 5, 4, 1}}
  };
  private static final int[] ORDERS = {51840, 40320, 23040, 12096, 10752, 4608, 4320, 1512};

  static long[] generators() {
    return GENERATORS.clone();
  }

  static final class Maximal {
    final int mOrder;
    final long[] mGenerators;

    private Maximal(final int order, final long[] generators) {
      mOrder = order;
      mGenerators = generators;
    }
  }

  private static long power(final long base, final int exponent) {
    long result = BinaryLinearActions.identity(6);
    for (int j = 0; j < exponent; ++j) {
      result = BinaryLinearActions.multiply(result, base, 6);
    }
    return result;
  }

  static List<Maximal> irreducibleMaximals() {
    final List<Maximal> result = new ArrayList<>();
    final int order = 512 * 3 * 15 * 63;
    if (new BinaryStrongChain(6, GENERATORS).order() != order) {
      throw new IllegalStateException("Wrong natural symplectic group order");
    }
    for (int i = 0; i < WORDS.length; ++i) {
      final long[] r = {0, GENERATORS[0], GENERATORS[1], 0, 0, 0, 0};
      for (final int[] op : WORDS[i]) {
        switch (op[0]) {
          case 1:
            // The ATLAS permutation words multiply right actions.
            r[op[3]] = BinaryLinearActions.multiply(r[op[2]], r[op[1]], 6);
            break;
          case 2:
            r[op[3]] = power(r[op[2]], op[1]);
            break;
          case 3:
            r[op[2]] = BinaryLinearActions.inverse(r[op[1]], 6);
            break;
          default:
            throw new IllegalStateException("Invalid ATLAS word instruction");
        }
      }
      final long[] generators = {r[1], r[2]};
      if (new BinaryStrongChain(6, generators).order() != ORDERS[i]) {
        throw new IllegalStateException("Wrong symplectic maximal subgroup order at " + (i + 1));
      }
      if (BinaryWreathSubgroups.irreducible(generators)) {
        result.add(new Maximal(ORDERS[i], generators));
      }
    }
    return result;
  }
}
