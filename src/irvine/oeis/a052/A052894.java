package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a053.A053492;

/**
 * A052894 a(n) is the number of Schr\u00f6der trees on n vertices with a prescribed root.
 * @author Sean A. Irvine
 */
public class A052894 extends A053492 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}
