package irvine.oeis.a024;

import irvine.math.IntegerUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024542 Lower bound on cumulative mean of distances between cards after n shuffles in <code>A024222</code>.
 * @author Sean A. Irvine
 */
public class A024542 implements Sequence {

  private int mN = 0;

  private int[] faro(final int[] cards) {
    final int[] res = new int[cards.length];
    for (int k = 0, j = cards.length / 2, i = 0; k < res.length; ++k) {
      res[k] = (k & 1) != (cards.length & 1) ? cards[j++] : cards[i++];
    }
    return res;
  }

  private boolean isIdentity(final int[] cards) {
    for (int k = 0; k < cards.length; ++k) {
      if (cards[k] != k) {
        return false;
      }
    }
    return true;
  }

  private long distance(final int[] cards) {
    long distance = 0;
    for (int k = 1; k < cards.length; ++k) {
      distance += Math.abs(cards[k] - cards[k - 1]);
    }
    return distance;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    int[] cards = IntegerUtils.identity(new int[mN]);
    long cumulativeDistance = 0;
    long faros = 0;
    do {
      cards = faro(cards);
      cumulativeDistance += distance(cards);
      ++faros;
    } while (!isIdentity(cards));
    return new Q(cumulativeDistance, (faros * (mN - 1))).floor();
  }
}
