package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014616 <code>a(n) =</code> solution to the postage stamp problem with 2 denominations and n stamps.
 * @author Sean A. Irvine
 */
public class A014616 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).add(6).multiply(mN).add(1).divide(4);
  }
}
