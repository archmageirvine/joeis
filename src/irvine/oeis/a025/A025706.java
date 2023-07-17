package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025706 Index of 5^n within sequence of numbers of form 4^i*5^j.
 * @author Sean A. Irvine
 */
public class A025706 extends A025617 {

  /** Construct the sequence. */
  public A025706() {
    super(0);
  }

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mA.equals(super.next()));
    mA = mA.multiply(5);
    return Z.valueOf(mN);
  }
}
