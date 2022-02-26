package irvine.oeis.a054;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * A054845.
 * @author Sean A. Irvine
 */
public class A054847 extends A054846 {

  @Override
  public Z next() {
    return CR.valueOf(super.next().pow(3)).sqrt().round();
  }
}
