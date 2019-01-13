package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a074.A074651;

/**
 * A029808.
 * @author Sean A. Irvine
 */
public class A029808 extends A074651 {

  @Override
  public Z next() {
    return super.next().divide(6);
  }
}
