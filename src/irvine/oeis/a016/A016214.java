package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016214 Expansion of <code>1/((1-x)(1-3x)(1-8x))</code>.
 * @author Sean A. Irvine
 */
public class A016214 implements Sequence {

  private Z mT = Z.valueOf(21);
  private int mN = 1;

  @Override
  public Z next() {
    mT = mT.multiply(3);
    return Z.ONE.shiftLeft(3 * ++mN + 1).subtract(mT).add(5).divide(70);
  }
}
