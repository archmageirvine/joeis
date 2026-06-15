package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002046 Larger of an amicable pair with smaller member A002025(n).
 * @author Sean A. Irvine
 */
public class A002046 extends A002025 {

  @Override
  protected Z select(final Z n, final Z a) {
    return a;
  }
}
