package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011875 Floor( n*(n-1)/22 ).
 * @author Sean A. Irvine
 */
public class A011875 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).divide(22);
  }
}
