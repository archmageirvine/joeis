package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027593 Sequence satisfies <code>T^2(a)=a</code>, where T is defined below.
 * @author Sean A. Irvine
 */
public class A027593 extends A027594 {

  @Override
  protected Z select(final Z a, final Z b) {
    return b;
  }
}
