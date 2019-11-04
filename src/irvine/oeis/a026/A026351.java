package irvine.oeis.a026;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026351 <code>Floor(n*phi) + 1</code>, where phi <code>= (1+sqrt(5))/2</code>.
 * @author Sean A. Irvine
 */
public class A026351 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.PHI.multiply(++mN).floor().add(1);
  }
}
