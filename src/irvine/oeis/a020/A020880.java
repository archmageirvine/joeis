package irvine.oeis.a020;

import irvine.math.z.Z;

/**
 * A020880 Number of strong elementary edge-subgraphs in Moebius ladder <code>M_n</code>.
 * @author Sean A. Irvine
 */
public class A020880 extends A020879 {

  @Override
  protected Z delta(final int n) {
    return (n & 1) == 0 ? Z.ZERO : Z.ONE;
  }

  @Override
  protected Z zeroCase(final int n) {
    return Z.THREE;
  }
}
