package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011891 <code>a(n) = floor( n*(n-1)*(n-2)/9 )</code>.
 * @author Sean A. Irvine
 */
public class A011891 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(mN - 1).multiply(++mN).divide(9);
  }
}
