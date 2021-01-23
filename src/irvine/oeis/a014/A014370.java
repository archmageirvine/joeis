package irvine.oeis.a014;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014370 If n = binomial(b,2)+binomial(c,1), b&gt;c&gt;=0 then a(n) = binomial(b+1,3)+binomial(c+1,2).
 * @author Sean A. Irvine
 */
public class A014370 implements Sequence {

  private long mN = 1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM == mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN + 1, 3).add(Binomial.binomial(mM + 1, 2));
  }
}

