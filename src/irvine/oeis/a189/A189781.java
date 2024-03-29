package irvine.oeis.a189;
// Generated by gen_seq4.pl floorr at 2021-08-24 07:13

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A189781 a(n) = n + [nr/s] + [nt/s]; r=Pi/2, s=arcsin(8/17), t=arcsin(15/17).
 * @author Georg Fischer
 */
public class A189781 extends FloorSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private final CR mR = CR.HALF.multiply(CR.PI);
  private final CR mS = REALS.asin(CR.EIGHT.divide(CR.valueOf(17)));
  private final CR mT = REALS.asin(CR.valueOf(15).divide(CR.valueOf(17)));

  /** Construct the sequence. */
  public A189781() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return Z.valueOf(n).add(CR.valueOf(n).multiply(mR).divide(mS).floor()).add(CR.valueOf(n).multiply(mT).divide(mS).floor());
  }

}
