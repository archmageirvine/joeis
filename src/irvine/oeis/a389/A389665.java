package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a390.A390419;

/**
 * A389665 Number of n X n grids with 2 non-attacking kings on each row.
 * @author Sean A. Irvine
 */
public class A389665 extends Sequence0 {

  private final A390419 mA = new A390419();
  private int mN = -1;

  @Override
  public Z next() {
    return mA.t(++mN, 2);
  }
}
