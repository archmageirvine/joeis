package irvine.oeis.a190;
// Generated by gen_seq4.pl floor at 2021-08-24 07:13

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;
/**
 * A190083 n + [n*r/s] + [n*t/s]; r=1, s=sin(2*Pi/5), t=csc(2*Pi/5).
 * @author Georg Fischer
 */
public class A190083 extends FloorSequence {

  private final CR mR = CR.ONE;
  private final CR mS = CR.TWO.divide(CR.FIVE).multiply(CR.PI).sin();
  private final CR mT = CR.ONE.divide(CR.TWO.divide(CR.FIVE).multiply(CR.PI).sin());

  /** Construct the sequence. */
  public A190083() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return Z.valueOf(n).add(CR.valueOf(n).multiply(mR).divide(mS).floor()).add(CR.valueOf(n).multiply(mT).divide(mS).floor());
  }

}
