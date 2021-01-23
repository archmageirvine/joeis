package irvine.oeis.a110;

import irvine.math.z.Z;

/**
 * A110783 Number of digits in A110782(n).
 * @author Sean A. Irvine
 */
public class A110783 extends A110782 {

  @Override
  protected Z output(final StringBuilder t) {
    return Z.valueOf(t.length());
  }
}

