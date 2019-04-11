package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000295 Eulerian numbers (Euler's triangle: column <code>k=2</code> of A008292, column <code>k=1</code> of A173018).
 * @author Sean A. Irvine
 */
public class A000295 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN).subtract(mN + 1);
  }
}
