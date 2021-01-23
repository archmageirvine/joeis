package irvine.oeis.a033;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033551 Closest integer to (Pi/4)*n^2.
 * @author Sean A. Irvine
 */
public class A033551 implements Sequence {

  private static final CR PI4 = CR.PI.divide(CR.FOUR);
  private long mN = 0;

  @Override
  public Z next() {
    return PI4.multiply(Z.valueOf(++mN).square()).round();
  }
}
