package irvine.oeis.a007;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import irvine.math.group.PolynomialRingField;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.HararyMultiply;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007716.
 * @author Sean A. Irvine
 */
public class A007716 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    final CycleIndex z = SymmetricGroup.create(++mN).cycleIndex();
    final CycleIndex z2 = z.op(HararyMultiply.OP, z);
    final List<Polynomial<Q>> subs = new ArrayList<>(z2.maxIndex());
    for (int k = 1; k <= z2.maxIndex(); ++k) {
      final Q[] c = new Q[mN + 1];
      Arrays.fill(c, Q.ZERO);
      for (int j = 0; j < c.length; j += k) {
        c[j] = Q.ONE;
      }
      subs.add(RING.create(Arrays.asList(c)));
    }
    final Polynomial<Q> gf = z2.apply(subs, Z.valueOf(mN));
    return gf.coeff(mN).toZ();
  }

}
