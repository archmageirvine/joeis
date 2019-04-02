package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;
import irvine.oeis.a035.A035349;
import irvine.oeis.a035.A035350;

import java.util.ArrayList;

/**
 * A000083 Number of mixed Husimi trees with n nodes; or polygonal cacti with bridges.
 * @author Sean A. Irvine
 */
public class A000083 extends A000237 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final A035349 mB = new A035349();
  private final A035350 mC = new A035350();
  private final ArrayList<Z> mD = new ArrayList<>();

  @Override
  public Z next() {
    final int n = mA.size();
    mD.add(mC.next());
    final Z a = super.next();
    final Z b = mB.next();
    return a.add(b).subtract(RING.multiply(RING.create(mD), RING.create(mA), n).coeff(n));
  }
}
