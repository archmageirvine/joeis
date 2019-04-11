package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001621 <code>a(n) = n*(n + 1)*(n^2 + n + 2)/4</code>.
 * @author Sean A. Irvine
 */
public class A001621 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.square().add(mN + 2).multiply(mN + 1).multiply(n).shiftRight(2);
  }
}
