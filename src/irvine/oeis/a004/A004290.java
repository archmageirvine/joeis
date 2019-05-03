package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004290 Least positive multiple of n that when written in base 10 uses only <code>0</code>'s and <code>1</code>'s.
 * @author Sean A. Irvine
 */
public class A004290 extends A004283 {

  @Override
  protected Z init() {
    return Z.NEG_ONE;
  }

  @Override
  protected int base() {
    return 10;
  }
}
