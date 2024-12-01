package irvine.oeis.a073;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a024.A024167;

/**
 * A073480 Triangle T(n,k) read by rows, where e.g.f. for T(n,k) is exp(x*y)*log(1+x)/(1-x).
 * @author Sean A. Irvine
 */
public class A073480 extends Sequence1 {

  private final DirectSequence mSeq = DirectSequence.create(1, new A024167());
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return mSeq.a(mN - mM).multiply(Binomial.binomial(mN, mM));
  }
}
