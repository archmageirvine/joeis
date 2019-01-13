package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a053.A053492;

/**
 * A052894.
 * @author Sean A. Irvine
 */
public class A052894 extends A053492 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}
