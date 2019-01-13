package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;
import irvine.oeis.a000.A000084;

import java.util.ArrayList;

/**
 * A001572.
 * @author Sean A. Irvine
 */
public class A001572 extends A000084 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final ArrayList<Z> mA84 = new ArrayList<>();
  {
    mA84.add(Z.ONE);
  }
  private int mN = -1;

  @Override
  public Z next() {
    // INVERTi transform of A000084
    mA84.add(super.next());
    return RING.coeff(RING.one(), RING.create(mA84), ++mN).abs();
  }
}
