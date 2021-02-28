package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a101.A101391;

/**
 * A039911 Triangle read by rows: number of compositions of n into relatively prime summands.
 * @author Sean A. Irvine
 */
public class A039911 extends A101391 {

  private long mN = 1;
  private long mM = 1;

  @Override
  public Z next() {
    if (--mM < 2) {
      mM = ++mN;
    }
    return t(mN, mM);
  }
}
