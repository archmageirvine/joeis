package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046862 Upper members of a "good pair" of the form (k, 2*k +- 1).
 * @author Sean A. Irvine
 */
public class A046862 extends A046861 {

  @Override
  protected Z select(final int n, final int m) {
    return Z.valueOf(m);
  }
}
