package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000045;

/**
 * A074824 Numbers k such that 2^k + Fibonacci(k) is prime.
 * @author Sean A. Irvine
 */
public class A074824 extends AbstractSequence {

  private final A000045 mSeq = new A000045();
  private Z mA = Z.ONE;
  private long mN = -1;

  /** Construct the sequence. */
  public A074824() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z f = mSeq.next();
      if (++mN > 0) {
        mA = mA.multiply2();
      }
      if (mA.add(f).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
