package irvine.oeis.a136;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A136516 a(n) = (2^n+1)^n.
 * @author Georg Fischer
 */
public class A136516 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN).add(1).pow(mN);
  }
}
