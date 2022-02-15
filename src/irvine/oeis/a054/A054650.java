package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054647.
 * @author Sean A. Irvine
 */
public class A054650 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).add(mN).divide(2L * mN);
  }
}
