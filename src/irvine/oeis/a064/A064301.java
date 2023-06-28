package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064301 Rightmost column of A064744; 2-adic valuation of the EKG-sequence.
 * @author Sean A. Irvine
 */
public class A064301 extends A064413 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().makeOdd().auxiliary());
  }
}
