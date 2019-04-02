package irvine.oeis.a110;

import irvine.math.z.Z;

/**
 * A110777 Number of digits in A110776(n).
 * @author Sean A. Irvine
 */
public class A110777 extends A110776 {

  @Override
  protected Z output(final StringBuilder t) {
    return Z.valueOf(t.length());
  }
}

