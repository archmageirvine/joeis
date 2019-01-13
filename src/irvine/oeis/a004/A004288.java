package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004288.
 * @author Sean A. Irvine
 */
public class A004288 extends A004283 {

  @Override
  protected Z init() {
    return Z.NEG_ONE;
  }

  @Override
  protected int base() {
    return 8;
  }
}
