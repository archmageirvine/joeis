package irvine.oeis.a278;
// manually floor at 2021-09-01 13:58

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A278907 a(n) = floor((n*2^(n+1)+2)/(2*n-(-1)^n+3)) - floor((n*2^(n+1)-2)/(2*n-(-1)^n+3)).
 * @author Georg Fischer
 */
public class A278907 extends FloorSequence {

  /** Construct the sequence. */
  public A278907() {
    super(0);
  }

  @Override
  protected Z evalCR(final long n) {
    final Z num = Z.valueOf(n).multiply(Z.ONE.shiftLeft((mN + 1)));
    final CR den = CR.valueOf(Z.valueOf(2 * mN + 3).subtract((mN & 1) == 1 ? Z.NEG_ONE : Z.ONE));
    return CR.valueOf(num).add(CR.TWO).divide(den).floor()
        .subtract(CR.valueOf(num).subtract(CR.TWO).divide(den).floor());
  }

}
