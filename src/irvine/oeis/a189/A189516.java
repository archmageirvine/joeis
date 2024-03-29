package irvine.oeis.a189;
// Generated by gen_seq4.pl floor at 2021-08-24 07:13

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;
/**
 * A189516 a(n) = n + [nr/s] + [nt/s]; r=1, s=Pi/2, t=2/Pi.
 * @author Georg Fischer
 */
public class A189516 extends FloorSequence {

  private final CR mR = CR.ONE;
  private final CR mS = CR.HALF.multiply(CR.PI);
  private final CR mT = CR.TWO.divide(CR.PI);

  /** Construct the sequence. */
  public A189516() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return Z.valueOf(n).add(CR.valueOf(n).multiply(mR).divide(mS).floor()).add(CR.valueOf(n).multiply(mT).divide(mS).floor());
  }

}
