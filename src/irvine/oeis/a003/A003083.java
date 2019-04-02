package irvine.oeis.a003;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a000.A000088;

import java.util.ArrayList;

/**
 * A003083 Sum a(n) x^n / n = log (1 + Sum g(n) x^n ), where g(n) is # graphs on n nodes (A000088).
 * @author Sean A. Irvine
 */
public class A003083 extends A000088 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final ArrayList<Q> mA88 = new ArrayList<>();
  {
    // skip 0th term
    super.next();
    mA88.add(Q.ZERO);
  }

  @Override
  public Z next() {
    final int n = mA88.size();
    mA88.add(new Q(super.next()));
    return RING.log1p(RING.create(mA88), n).coeff(n).multiply(n).toZ();
  }
}
