package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029588 <code>a(n) = A029572(n) / 24</code>.
 * @author Sean A. Irvine
 */
public class A029588 extends A029572 {

  @Override
  public Z next() {
    return super.next().divide(24);
  }
}
