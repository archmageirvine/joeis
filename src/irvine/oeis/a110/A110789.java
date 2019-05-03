package irvine.oeis.a110;

import irvine.math.z.Z;

/**
 * A110789 Number of digits in <code>A110788(n)</code>.
 * @author Sean A. Irvine
 */
public class A110789 extends A110788 {

  @Override
  protected Z output(final StringBuilder t) {
    return Z.valueOf(t.length());
  }
}

