package irvine.oeis.a386;

import irvine.math.z.Z;

/**
 * A386756 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A386902 extends A386903 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 5);
  }
}
