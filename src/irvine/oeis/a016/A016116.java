package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016116 <code>a(n) = 2^floor(n/2)</code>.
 * @author Sean A. Irvine
 */
public class A016116 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN / 2);
  }
}
