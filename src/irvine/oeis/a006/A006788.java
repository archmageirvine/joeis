package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006788 Floor( 2^(n-1)/n ).
 * @author Sean A. Irvine
 */
public class A006788 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(mN++).divide(mN);
  }
}
