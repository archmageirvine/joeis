package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a074.A074652;

/**
 * A029809.
 * @author Sean A. Irvine
 */
public class A029809 extends A074652 {

  @Override
  public Z next() {
    return super.next().divide(24);
  }
}
