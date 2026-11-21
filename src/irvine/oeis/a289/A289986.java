package irvine.oeis.a289;

import irvine.math.z.Z;
import irvine.oeis.a328.A328682;

/**
 * A289986 Number of connected 2n-regular loopless multigraphs on 2n unlabeled nodes.
 * @author Gregory Morse
 */
public class A289986 extends A328682 {
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return t(mN, mN);
  }
}
