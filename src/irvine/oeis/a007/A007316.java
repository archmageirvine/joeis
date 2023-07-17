package irvine.oeis.a007;

import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;
import irvine.oeis.a000.A000111;

/**
 * A007316 Reversion of g.f. for Euler numbers A000111(n-1).
 * @author Sean A. Irvine
 */
public class A007316 extends A000111 {

  /** Construct the sequence. */
  public A007316() {
    super(1);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private final ArrayList<Z> mP = new ArrayList<>();
  private int mN = 0;

  {
    mP.add(Z.ZERO);
  }

  @Override
  public Z next() {
    ++mN;
    mP.add(super.next());
    return RING.reversion(RING.create(mP), mN).coeff(mN);
  }
}

