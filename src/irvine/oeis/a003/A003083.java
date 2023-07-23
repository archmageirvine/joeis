package irvine.oeis.a003;

import java.util.ArrayList;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000088;

/**
 * A003083 Sum a(n) x^n / n = log (1 + Sum g(n) x^n ), where g(n) is # graphs on n nodes (A000088).
 * @author Sean A. Irvine
 */
public class A003083 extends AbstractSequence {

  private final A000088 mSeq1 = new A000088();

  /** Construct the sequence. */
  public A003083() {
    super(1);
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final ArrayList<Q> mA88 = new ArrayList<>();

  {
    // skip 0th term
    mSeq1.next();
    mA88.add(Q.ZERO);
  }

  @Override
  public Z next() {
    final int n = mA88.size();
    mA88.add(new Q(mSeq1.next()));
    return RING.log1p(RING.create(mA88), n).coeff(n).multiply(n).toZ();
  }
}
