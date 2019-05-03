package irvine.oeis.a110;

import irvine.math.z.Z;

/**
 * A110793 Number of digits in <code>A110792(n)</code>.
 * @author Sean A. Irvine
 */
public class A110793 extends A110792 {

  @Override
  protected Z output(final StringBuilder t) {
    return Z.valueOf(t.length());
  }
}

