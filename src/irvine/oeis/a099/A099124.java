package irvine.oeis.a099;
// Generated by gen_seq4.pl build/simple at 2022-06-14 21:39

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A099124 Number of orbits of the wreath product of S_n with S_n on n X n matrices over {0,1,2,3,4,5}.
 * @author Georg Fischer
 */
public class A099124 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(Binomial.binomial(mN + 5, mN).add(mN - 1), Z.valueOf(mN));
  }
}
