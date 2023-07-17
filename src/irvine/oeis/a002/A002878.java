package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000204;

/**
 * A002878 Bisection of Lucas sequence: a(n) = L(2*n+1).
 * @author Sean A. Irvine
 */
public class A002878 extends A000204 {

  /** Construct the sequence. */
  public A002878() {
    super(0);
  }

  @Override
  public Z next() {
    final Z res = super.next();
    super.next();
    return res;
  }
}

