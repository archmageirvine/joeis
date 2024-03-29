package irvine.oeis.a062;
// Generated by gen_seq4.pl A062450/simple at 2022-06-14 21:28

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062449 Integer part of log(n^n)^(1 + log(1 + log(n))).
 * @author Georg Fischer
 */
public class A062449 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mN <= 1 ? Z.ZERO : CR.valueOf(Z.valueOf(mN).pow(mN)).log().pow(CR.ONE.add(CR.ONE.add(CR.valueOf(mN).log()).log())).floor();
  }
}
