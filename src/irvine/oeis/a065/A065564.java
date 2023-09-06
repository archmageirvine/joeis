package irvine.oeis.a065;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065564 Numbers k such that floor((4/3)^(k+1))/floor((4/3)^k) = 4/3.
 * @author Sean A. Irvine
 */
public class A065564 extends Sequence1 {

  private final Q mC;
  private long mN = 0;
  private Q mQ;

  protected A065564(final Q constant) {
    mC = constant;
    mQ = constant;
  }

  /** Construct the sequence. */
  public A065564() {
    this(new Q(4, 3));
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Q t = mQ.multiply(mC);
      if (new Q(t.toZ(), mQ.toZ()).equals(mC)) {
        mQ = t;
        return Z.valueOf(mN);
      }
      mQ = t;
    }
  }
}
