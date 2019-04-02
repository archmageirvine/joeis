package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011862 a(n) = floor(n*(n-1)/9).
 * @author Sean A. Irvine
 */
public class A011862 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).divide(9);
  }
}
