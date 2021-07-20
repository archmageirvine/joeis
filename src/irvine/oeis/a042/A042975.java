package irvine.oeis.a042;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;
import irvine.oeis.Sequence;

/**
 * A042975 Decimal expansion of sqrt(.121121112...), cf. A042974.
 * @author Sean A. Irvine
 */
public class A042975 extends DecimalExpansionSequence {

  protected static final CR M = new CR() {

    private final Sequence mSeq = new A042974();
    private Z mA = Z.ZERO;
    private Z mB = Z.ONE;

    @Override
    protected Z approximate(final int precision) {
      if (precision > 0) {
        return Z.ZERO;
      }
      final int p = -precision;
      while (mA.bitLength() <= p) {
        mA = mA.multiply(10).add(mSeq.next());
        mB = mB.multiply(10);
      }
      final Q q = new Q(mA, mB);
      return CR.valueOf(q).getApprox(precision);
    }
  };

  /** Construct the sequence. */
  public A042975() {
    super(M.sqrt());
  }
}
