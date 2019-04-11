package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005126 <code>a(n) = 2^n + n + 1</code>.
 * @author Sean A. Irvine
 */
public class A005126 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).add(mN + 1);
  }
}

