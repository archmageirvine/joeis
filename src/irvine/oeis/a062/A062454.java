package irvine.oeis.a062;
// Generated by gen_seq4.pl A062450/simple at 2022-06-14 21:28

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062454 Nearest integer to log(n!)^sqrt(n).
 * @author Georg Fischer
 */
public class A062454 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mN <= 2 ? (mN == 1 ? Z.ZERO : Z.ONE) : CR.valueOf(Functions.FACTORIAL.z(mN)).log().pow(CR.valueOf(mN).sqrt()).round();
  }
}
