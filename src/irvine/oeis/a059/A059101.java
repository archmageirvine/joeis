package irvine.oeis.a059;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001203;
import irvine.oeis.a002.A002210;

/**
 * A059101 Number of terms of the fractional part of A001203 for which the geometric mean produces increasingly better approximations to Khinchin's constant.
 * @author Sean A. Irvine
 */
public class A059101 extends Sequence1 {

  private final Sequence mSeq;
  private final CR mKhinchin;
  private CR mQ = CR.ONE;
  private CR mR = null;
  private int mN = 0;

  protected A059101(final Sequence seq) {
    mSeq = seq;
    mSeq.next();
    mKhinchin = new A002210().getCR();
  }

  /** Construct the sequence. */
  public A059101() {
    this(new A001203());
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mQ = mQ.multiply(mSeq.next());
      final CR g = mQ.pow(new Q(1, mN)).subtract(mKhinchin).abs();
      if (mN == 1 || g.compareTo(mR) < 0) {
        mR = g;
        return Z.valueOf(mN);
      }
    }
  }
}

