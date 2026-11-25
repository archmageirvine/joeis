package irvine.oeis.a087;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087553 Squares in which the neighboring digits differ at most by 1. Neighbors of 1 are 0 and 2, neighbors of 0 are 1 and 9.
 * @author Sean A. Irvine
 */
public class A087553 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 0;
  {
    mA.add(Z.ZERO);
  }

  private void search(final Z n, final long prev, final long cnt) {
    if (cnt == mN) {
      if (n.isSquare()) {
        mA.add(n);
      }
      return;
    }
    final Z t = n.multiply(10);
    search(t.add(prev), prev, cnt + 1);
    final long up = (prev + 1) % 10;
    search(t.add(up), up, cnt + 1);
    final long down = (prev + 9) % 10;
    search(t.add(down), down, cnt + 1);
  }

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      ++mN;
      // Find all mN digit terms
      for (long k = 1; k <= 9; ++k) {
        search(Z.valueOf(k), k, 1);
      }
    }
    return mA.pollFirst();
  }
}
