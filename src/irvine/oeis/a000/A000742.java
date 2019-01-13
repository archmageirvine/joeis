package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000742.
 * @author Sean A. Irvine
 */
public class A000742 extends A000741 {

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  protected Z p(final Z n) {
    final Z nm = n.subtract(1);
    final Z ns = nm.square();
    return ns.multiply(nm).subtract(ns.multiply(3)).add(n.multiply2()).divide(6);
  }
}
