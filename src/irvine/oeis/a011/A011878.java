package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011878 <code>a(n) = floor( n(n-1)/25 )</code>.
 * @author Sean A. Irvine
 */
public class A011878 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).divide(25);
  }
}
