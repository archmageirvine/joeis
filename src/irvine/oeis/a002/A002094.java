package irvine.oeis.a002;

import java.util.ArrayList;

import irvine.math.group.DihedralGroup;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000642;

/**
 * A002094 Number of unlabeled connected loop-less graphs on n nodes containing exactly one cycle (of length at least <code>2)</code> and with all nodes of degree <code>&lt;= 4</code>.
 * @author Sean A. Irvine
 */
public class A002094 extends A000642 {

  // After R. J. Mathar

  {
    super.next();
  }

  @Override
  public Z next() {
    super.next();
    final Polynomial<Q> g = g().truncate(mN - 1).shift(1);
    final ArrayList<Polynomial<Q>> lst = new ArrayList<>();
    for (int k = 1; k <= mN; ++k) {
      lst.add(g.substitutePower(k, mN));
    }
    Polynomial<Q> gf = RING.zero();
    for (int k = 2; k <= mN; ++k) {
      gf = RING.add(gf, DihedralGroup.cycleIndex(k).apply(lst, Z.valueOf(mN)));
    }
    return gf.coeff(mN).toZ();
  }
}
