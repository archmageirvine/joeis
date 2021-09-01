package irvine.oeis.a136;
// manually floor at 2021-09-01 16:25

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A136424 a(n) = floor((x^n - (1-x)^n) / (2x-1) +.5) where x = (sqrt(6)+1)/2 (and hence 2x-1 = sqrt(6)).
 * @author Georg Fischer
 */
public class A136424 extends FloorSequence {

  private final CR mX = CR.SIX.sqrt().add(CR.ONE).divide(CR.TWO);

  /** Construct the sequence */
  public A136424() {
    super(1);
  }

  @Override
  protected Z evalCR(final long n) {
    return mX.pow(n).subtract(CR.ONE.subtract(mX).pow(n)).divide(CR.TWO.multiply(mX).subtract(CR.ONE)).add(CR.HALF).floor();
  }

}
