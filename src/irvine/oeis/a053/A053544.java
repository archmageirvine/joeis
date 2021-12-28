package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a052.A052999;

/**
 * A053544 A052999 / 18.
 * @author Sean A. Irvine
 */
public class A053544 extends A052999 {

  @Override
  public Z next() {
    return super.next().divide(18);
  }
}
