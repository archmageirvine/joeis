package irvine.oeis.a386;

import irvine.math.z.Z;

/**
 * A386757 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A386757 extends A386779 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 5);
  }
}

