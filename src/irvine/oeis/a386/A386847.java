package irvine.oeis.a386;

import irvine.math.z.Z;

/**
 * A386847 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A386847 extends A386848 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 5);
  }
}

