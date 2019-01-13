package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006422.
 * @author Sean A. Irvine
 */
public class A006422 implements Sequence {

  // Using conjectured formula

  private long mN = 0;

  @Override
  public Z next() {
    return Z.EIGHT.multiply(++mN).add(111).multiply(mN).add(425).multiply(mN).add(615).multiply(mN).add(287).multiply(mN).subtract(6).multiply(mN).divide(360);
  }
}

