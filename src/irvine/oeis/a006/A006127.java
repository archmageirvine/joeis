package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006127 <code>a(n) = 2^n +</code> n.
 * @author Sean A. Irvine
 */
public class A006127 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).add(mN);
  }
}
