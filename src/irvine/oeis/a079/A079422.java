package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A079422 a(n) = number of 1's in the first n^2 Spiro-Fibonacci differences.
 * @author Sean A. Irvine
 */
public class A079422 extends Sequence1 {

  private final Sequence mA = new A079421();
  private long mCount = 0;
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    final long s = ++mN * mN;
    while (mM < s) {
      ++mM;
      if (mA.next().isOne()) {
        ++mCount;
      }
    }
    return Z.valueOf(mCount);
  }
}

