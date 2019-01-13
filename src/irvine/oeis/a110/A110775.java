package irvine.oeis.a110;

import irvine.math.z.Z;

/**
 * A110775.
 * @author Sean A. Irvine
 */
public class A110775 extends A110774 {

  @Override
  protected Z output(final StringBuilder t) {
    return Z.valueOf(t.length());
  }
}

