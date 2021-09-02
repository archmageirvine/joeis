package irvine.oeis.a189;
// manually floor at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A189931 c(n) = n + [n*r/t] + [n*s/t]; r=1, s=sin(2pi/5), t=cos(2pi/5).
 * @author Georg Fischer
 */
public class A189931 extends FloorSequence {

  private final CR mR = CR.ONE;
  private final CR mS = CR.TWO.multiply(CR.PI).divide(CR.FIVE).sin();
  private final CR mT = CR.TWO.multiply(CR.PI).divide(CR.FIVE).cos();

  /** Construct the sequence. */
  public A189931() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return Z.valueOf(n).add(mR.multiply(CR.valueOf(n)).divide(mT).floor()).add(mS.multiply(CR.valueOf(n)).divide(mT).floor());
  }

}
