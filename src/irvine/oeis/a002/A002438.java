package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000364;

/**
 * A002438 Multiples of Euler numbers.
 * @author Sean A. Irvine
 */
public class A002438 extends A000364 {

  /** Construct the sequence. */
  public A002438() {
    super(1);
  }

  private Z mMul = null;

  @Override
  public Z next() {
    mMul = mMul == null ? Z.ONE : mMul.multiply(9);
    return super.next().multiply(mMul.add(1)).divide2();
  }
}
