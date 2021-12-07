package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A062971 a(n) = (2*n)^n.
 * @author Georg Fischer
 */
public class A062971 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(2 * mN).pow(mN);
  }
}
