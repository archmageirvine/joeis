package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000337 <code>a(n) = (n-1)*2^n + 1</code>.
 * @author Sean A. Irvine
 */
public class A000337 implements Sequence {

  private int mN = -2;

  @Override
  public Z next() {
    return Z.valueOf(++mN).shiftLeft(mN + 1).add(1);
  }
}

