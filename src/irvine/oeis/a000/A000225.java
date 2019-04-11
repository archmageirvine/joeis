package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000225 <code>a(n) = 2^n - 1.</code> (Sometimes called Mersenne numbers, although that name is usually reserved for A001348.).
 * @author Sean A. Irvine
 */
public class A000225 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).subtract(Z.ONE);
  }
}

