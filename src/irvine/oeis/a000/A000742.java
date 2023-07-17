package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000742 Number of compositions of n into 4 ordered relatively prime parts.
 * @author Sean A. Irvine
 */
public class A000742 extends A000741 {

  /** Construct the sequence. */
  public A000742() {
    super(4);
  }

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
