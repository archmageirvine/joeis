package irvine.oeis.a121;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A121520 a(n) = (10^n+1)^n.
 * @author Georg Fischer
 */
public class A121520 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.TEN.pow(mN).add(1).pow(mN);
  }
}
