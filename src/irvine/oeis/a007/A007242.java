package irvine.oeis.a007;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a000.A000521;

/**
 * A007242 McKay-Thompson series of class 2a for the Monster group.
 * @author Sean A. Irvine
 */
public class A007242 extends A000521 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final List<Q> mJ = new ArrayList<>();
  private int mN = -1;

  @Override
  public Z next() {
    final Z j = super.next();
    mJ.add(new Q(++mN == 1 ? j.subtract(1728) : j));
    return RING.sqrt(RING.create(mJ), mN).coeff(mN).toZ();
  }
}
