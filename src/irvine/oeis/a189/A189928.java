package irvine.oeis.a189;
// manually floor at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A189928 c(n) = n + [n*r/t] + [n*s/t]; r=1, s=sin(Pi/5), t=cos(Pi/5), where [] denotes the floor function.
 * @author Georg Fischer
 */
public class A189928 extends FloorSequence {

  private final CR mR = CR.ONE;
  private final CR mS = CR.PI.divide(CR.FIVE).sin();
  private final CR mT = CR.PI.divide(CR.FIVE).cos();

  /** Construct the sequence. */
  public A189928() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return Z.valueOf(n).add(mR.multiply(CR.valueOf(n)).divide(mT).floor()).add(mS.multiply(CR.valueOf(n)).divide(mT).floor());
  }

}
