package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011858 a(n) = floor( n*(n-1)/5 ).
 * @author Sean A. Irvine
 */
public class A011858 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).divide(5);
  }
}
