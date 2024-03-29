package irvine.oeis.a136;
// Generated by gen_seq4.pl floor at 2021-08-31 21:27

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A136421 a(n) = floor((x^n - (1-x)^n)/sqrt(2)+ 1/2) where x = (sqrt(2)+1)/2.
 * @author Georg Fischer
 */
public class A136421 extends FloorSequence {

  private final CR mX = CR.SQRT2.add(CR.ONE).divide(CR.TWO);

  /** Construct the sequence. */
  public A136421() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return mX.pow(n).subtract(CR.ONE.subtract(mX).pow(n)).divide(CR.SQRT2).add(CR.HALF).floor();
  }

}
