package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027593 Duplicate of <code>A007211</code>.
 * @author Sean A. Irvine
 */
public class A027593 extends A027594 {

  @Override
  protected Z select(final Z a, final Z b) {
    return b;
  }
}
