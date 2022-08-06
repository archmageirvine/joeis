package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058227 Number of edges in all simple (loopless) paths, connecting any node with all the remaining ones in optimal graphs of degree 4.
 * @author Sean A. Irvine
 */
public class A058227 implements Sequence {

  // WARNING: Conjectural

  private Z mA = Z.ZERO;
  private int mN = 0;

  @Override
  public Z next() {
    mA = mA.add(Z.ONE.shiftLeft(++mN).subtract(1).multiply(4L * mN));
    return mA;
  }
}
