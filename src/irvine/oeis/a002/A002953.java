package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002953 Larger of unitary amicable pair.
 * @author Sean A. Irvine
 */
public class A002953 extends A002952 {

  @Override
  protected Z select(final Z n, final Z a) {
    return a;
  }
}
