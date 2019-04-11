package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014964 <code>a(n) =</code> lcm(n, <code>2^(n-1))</code>.
 * @author Sean A. Irvine
 */
public class A014964 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(mN++).lcm(Z.valueOf(mN));
  }
}
