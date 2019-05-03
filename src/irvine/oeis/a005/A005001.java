package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000110;

/**
 * A005001 <code>a(0) = 0</code>; for <code>n&gt;0, a(n) = Sum_k={0..n-1} Bell(k)</code>, where the Bell numbers <code>Bell(k)</code> are given in <code>A000110</code>.
 * @author Sean A. Irvine
 */
public class A005001 extends PartialSumSequence {

  private boolean mFirst = true;

  /** Construct the sequence. */
  public A005001() {
    super(new A000110());
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return super.next();
  }
}
