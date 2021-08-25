package irvine.oeis.a134;
// manually dersimple at 2021-08-25 19:44

import irvine.math.z.Z;
import irvine.oeis.a022.A022329;
/**
 * A134583 Signature sequence of the Hausdorff dimension of the Cantor set log(2)/log(3).
 * @author Georg Fischer
 */
public class A134583 extends A022329 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
