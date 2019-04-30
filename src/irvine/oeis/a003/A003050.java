package irvine.oeis.a003;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003050 Number of primitive sublattices of index n in hexagonal lattice: triples <code>x,y,z</code> from Z/nZ with <code>x+y+z=0</code>, discarding <code>any</code> triple that can be obtained from another by multiplying by a unit and permuting.
 * @author Sean A. Irvine
 */
public class A003050 implements Sequence {

  private static final int[] C2 = {2, 1, 0, 1, 1, 1, 0, 1};
  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence f = Cheetah.factor(++mN);
    Z a = Z.valueOf(mN);
    for (final Z p : f.toZArray()) {
      a = a.multiply(p.add(1)).divide(p);
    }
    if ((mN & 1) == 1 && mN % 9 != 0) {
      Z c1 = Z.ONE;
      for (final Z p : f.toZArray()) {
        c1 = c1.multiply(1 + p.jacobi(Z.THREE));
      }
      a = a.add(c1.multiply2());
    }
    final int c2 = C2[(int) (mN & 7)];
    a = a.add(Z.SIX.shiftLeft(f.omega() - 2 + c2));
    assert a.mod(6) == 0;
    return a.divide(6);
  }
}
