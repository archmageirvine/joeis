package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034319 McKay-Thompson series of class 13A for the Monster group with a(0) = 0.
 * @author Sean A. Irvine
 */
public class A034319 extends A034318 {

  @Override
  public Z next() {
    return Z.ZERO.max(super.next());
  }
}

