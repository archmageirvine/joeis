package irvine.oeis.a007;

import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A007296 Reversion of <code>(1 +</code> g.f. for <code>primes)</code>.
 * @author Sean A. Irvine
 */
public class A007296 extends A000040 {

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private final ArrayList<Z> mP = new ArrayList<>();
  private int mN = 0;
  {
    mP.add(Z.ZERO);
    mP.add(Z.ONE);
  }

  @Override
  public Z next() {
    ++mN;
    mP.add(super.next());
    return RING.reversion(RING.create(mP), mN).coeff(mN);
  }

}

