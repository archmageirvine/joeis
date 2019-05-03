package irvine.oeis.a110;

import irvine.math.z.Z;

/**
 * A110791 Number of digits in <code>A110790(n)</code>.
 * @author Sean A. Irvine
 */
public class A110791 extends A110790 {

  @Override
  protected Z output(final StringBuilder t) {
    return Z.valueOf(t.length());
  }
}

