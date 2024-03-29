package irvine.oeis.a190;
// Generated by gen_seq4.pl floor at 2021-08-24 07:13

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;
/**
 * A190081 n + [n*r/t] + [n*s/t];  r=1, s=cos(Pi/5), t=sec(Pi/5).
 * @author Georg Fischer
 */
public class A190081 extends FloorSequence {

  private final CR mR = CR.ONE;
  private final CR mS = CR.ONE.divide(CR.FIVE).multiply(CR.PI).cos();
  private final CR mT = CR.ONE.divide(CR.ONE.divide(CR.FIVE).multiply(CR.PI).cos());

  /** Construct the sequence. */
  public A190081() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return Z.valueOf(n).add(CR.valueOf(n).multiply(mR).divide(mT).floor()).add(CR.valueOf(n).multiply(mS).divide(mT).floor());
  }

}
