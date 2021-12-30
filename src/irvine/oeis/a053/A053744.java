package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A053744 Sum of 3 consecutive digits of Pi.
 * @author Georg Fischer
 */
public class A053744 extends A000796 {

  protected Z mDig1;
  protected Z mDig2;

  /** Construct the sequence. */
  public A053744() {
    mDig1 = super.next();
    mDig2 = super.next();
  }

  @Override
  public Z next() {
    final Z dig3 = super.next();
    final Z result = mDig1.add(mDig2).add(dig3);
    mDig1 = mDig2;
    mDig2 = dig3;
    return result;
  }
}
