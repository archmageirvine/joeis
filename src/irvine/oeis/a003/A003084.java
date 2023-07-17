package irvine.oeis.a003;

import java.util.ArrayList;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a000.A000273;

/**
 * A003084 Related to number of digraphs.
 * @author Sean A. Irvine
 */
public class A003084 extends A000273 {

  /** Construct the sequence. */
  public A003084() {
    super(1);
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final ArrayList<Q> mA = new ArrayList<>();

  {
    // skip 0th term
    super.next();
    mA.add(Q.ZERO);
  }

  @Override
  public Z next() {
    final int n = mA.size();
    mA.add(new Q(super.next()));
    return RING.log1p(RING.create(mA), n).coeff(n).multiply(n).toZ();
  }
}
