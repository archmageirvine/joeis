package irvine.oeis.a135;
// manually 2021-01-20

import irvine.math.z.Z;
import irvine.oeis.a134.A134720;

/**
 * A135619 Even Padovan numbers divided by 2.
 * @author Georg Fischer
 */
public class A135619 extends A134720 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
