package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025702 Index of 4^n within sequence of numbers of form 4^i*5^j.
 * @author Sean A. Irvine
 */
public class A025702 extends A025617 {

  /** Construct the sequence. */
  public A025702() {
    super(0);
  }

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mA.equals(super.next()));
    mA = mA.shiftLeft(2);
    return Z.valueOf(mN);
  }
}
