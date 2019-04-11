package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011858 <code>a(n) = floor( n*(n-1)/5 )</code>.
 * @author Sean A. Irvine
 */
public class A011858 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).divide(5);
  }
}
