package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390782 Number of n X n grids with 4 non-attacking kings on each row.
 * @author Sean A. Irvine
 */
public class A390782 extends Sequence0 {

  private final A390419 mA = new A390419();
  private int mN = -1;

  @Override
  public Z next() {
    return mA.t(++mN, 4);
  }
}
