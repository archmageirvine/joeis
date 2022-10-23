package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A022917 Multinomial coefficient n!/ ([n/4]!, [(n+1)/4]!, [(n+2)/4]!, [(n+3)/4]!).
 * @author Sean A. Irvine
 */
public class A022917 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Binomial.multinomial(++mN, mN / 4, (mN + 1) / 4, (mN + 2) / 4, (mN + 3) / 4);
  }
}
