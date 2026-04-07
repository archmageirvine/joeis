package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000720;

/**
 * A084360 Number of partitions of n into pair of parts whose difference is a prime.
 * @author Sean A. Irvine
 */
public class A084360 extends Sequence1 {

  private final Sequence mPi = new A000720().prepend(0);
  private long mN = 0;

  @Override
  public Z next() {
    return mPi.next().subtract(2).multiply(++mN & 1).add(1).add(1 / mN).subtract((mN / 2) * (2 / mN));
  }
}
