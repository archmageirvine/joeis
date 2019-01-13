package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006383.
 * @author Sean A. Irvine
 */
public class A006383 extends A006380 {

  private int mM = -1;

  @Override
  public Z next() {
    return t(++mM, mM);
  }
}
