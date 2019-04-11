package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018215 <code>a(n) = n*4^n</code>.
 * @author Sean A. Irvine
 */
public class A018215 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(2 * ++mN).multiply(mN);
  }
}

