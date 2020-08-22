package irvine.oeis.a282;

import java.util.Collections;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004009;
import irvine.oeis.a006.A006352;

/**
 * A282019 Coefficients in q-expansion of E_2*E_4, where E_2 and E_4 are the Eisenstein series shown in A006352 and A004009, respectively.
 * @author Sean A. Irvine
 */
public class A282019 extends A006352 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);

  private final Polynomial<Z> mE2 = RING.create(Collections.emptyList());
  private final Polynomial<Z> mE4 = RING.create(Collections.emptyList());
  private final Sequence mE4Seq = new A004009();
  private int mN = -1;

  @Override
  public Z next() {
    mE2.add(super.next());
    mE4.add(mE4Seq.next());
    return RING.multiply(mE2, mE4, ++mN).coeff(mN);
  }
}

