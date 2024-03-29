package irvine.oeis.a189;
// Generated by gen_seq4.pl floor at 2021-08-24 07:13

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;
/**
 * A189522 n+[nr/s]+[nt/s]; r=1, s=1/(e-1), t=1/(e+1).
 * @author Georg Fischer
 */
public class A189522 extends FloorSequence {

  private final CR mR = CR.ONE;
  private final CR mS = CR.ONE.divide(CR.E.subtract(CR.ONE));
  private final CR mT = CR.ONE.divide(CR.E.add(CR.ONE));

  /** Construct the sequence. */
  public A189522() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return Z.valueOf(n).add(CR.valueOf(n).multiply(mR).divide(mS).floor()).add(CR.valueOf(n).multiply(mT).divide(mS).floor());
  }

}
