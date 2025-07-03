package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a005.A005867;

/**
 * A078456 Number of numbers less than prime(1)*...*prime(n) having exactly one prime factor among (prime(1),...,prime(n)) where prime(n) is the n-th prime.
 * @author Sean A. Irvine
 */
public class A078456 extends A000040 {

  private final Sequence mSeq = new A005867();
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = super.next().subtract(1).multiply(mA).add(mSeq.next());
    return mA;
  }
}

