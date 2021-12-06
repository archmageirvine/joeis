package irvine.oeis.a251;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A251657 a(n) = (2^n + 3)^n.
 * @author Georg Fischer
 */
public class A251657 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN).add(3).pow(mN);
  }
}
