package irvine.oeis.a189;
// Generated by gen_seq4.pl floorr at 2021-08-24 07:13

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A189679 n+[nr/t]+[ns/t]; r=1, s=arctan(1/2), t=arctan(2).
 * @author Georg Fischer
 */
public class A189679 extends FloorSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private final CR mR = CR.ONE;
  private final CR mS = REALS.atan(CR.HALF);
  private final CR mT = REALS.atan(CR.TWO);

  /** Construct the sequence. */
  public A189679() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return Z.valueOf(n).add(CR.valueOf(n).multiply(mR).divide(mT).floor()).add(CR.valueOf(n).multiply(mS).divide(mT).floor());
  }

}
