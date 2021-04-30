package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046862 Upper members of good pairs.
 * @author Sean A. Irvine
 */
public class A046862 extends A046861 {

  @Override
  protected Z select(final int n, final int m) {
    return Z.valueOf(m);
  }
}
