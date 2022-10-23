package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006422 Number of rooted toroidal maps with 2 faces and n vertices and without separating cycles or isthmuses.
 * @author Sean A. Irvine
 */
public class A006422 extends Sequence1 {

  // Using conjectured formula

  private long mN = 0;

  @Override
  public Z next() {
    return Z.EIGHT.multiply(++mN).add(111).multiply(mN).add(425).multiply(mN).add(615).multiply(mN).add(287).multiply(mN).subtract(6).multiply(mN).divide(360);
  }
}

