package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a003.A003595;

/**
 * A025708 Index of 5^n within sequence of numbers of form 5^i*7^j.
 * @author Sean A. Irvine
 */
public class A025708 extends A003595 {

  /** Construct the sequence. */
  public A025708() {
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
