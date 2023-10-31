package irvine.oeis.a066;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000010;
import irvine.oeis.a002.A002322;

/**
 * A066605 Numbers k such that phi(k)/lambda(k) increases to a record value, where phi(k) is the Euler totient function (A000010) and lambda(k) is the Carmichael lambda function (A002322).
 * @author Sean A. Irvine
 */
public class A066605 extends Sequence1 {

  private final Sequence mPhi = new A000010();
  private final Sequence mLambda = new A002322();
  private Q mMax = Q.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Q t = new Q(mPhi.next(), mLambda.next());
      if (t.compareTo(mMax) > 0) {
        mMax = t;
        return Z.valueOf(mN);
      }
    }
  }
}
