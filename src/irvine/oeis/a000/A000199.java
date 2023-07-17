package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000199 Coefficient of q^(2n-1) in the series expansion of Ramanujan's mock theta function f(q).
 * @author Sean A. Irvine
 */
public class A000199 extends A000025 {

  /** Construct the sequence. */
  public A000199() {
    super(1);
  }

  @Override
  public Z next() {
    super.next();
    return super.next();
  }
}

