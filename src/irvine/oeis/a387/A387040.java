package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.a386.A386296;

/**
 * A387040 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A387040 extends A386296 {

  private int mN = 0;

  @Override
  protected boolean accept(final int[] set) {
    return isDistinctVolumes(set);
  }

  @Override
  public Z next() {
    return t(++mN, 5);
  }
}

