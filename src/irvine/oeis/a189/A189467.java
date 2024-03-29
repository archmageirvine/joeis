package irvine.oeis.a189;
// Generated by gen_seq4.pl floor at 2021-08-24 07:13

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;
/**
 * A189467 a(n) = n + [n*r/s] + [n*t/s]; r=1, s=1+sqrt(2), t=1/2+sqrt(2).
 * @author Georg Fischer
 */
public class A189467 extends FloorSequence {

  private final CR mR = CR.ONE;
  private final CR mS = CR.ONE.add(CR.SQRT2);
  private final CR mT = CR.HALF.add(CR.SQRT2);

  /** Construct the sequence. */
  public A189467() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return Z.valueOf(n).add(CR.valueOf(n).multiply(mR).divide(mS).floor()).add(CR.valueOf(n).multiply(mT).divide(mS).floor());
  }

}
