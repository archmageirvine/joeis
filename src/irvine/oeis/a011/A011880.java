package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011880 a(n) = floor(n*(n-1)/27).
 * @author Sean A. Irvine
 */
public class A011880 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).divide(27);
  }
}
