package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005578 a(2*n) = 2*a(2*n-1), a(2*n+1) = 2*a(2*n)-1.
 * @author Sean A. Irvine
 */
public class A005578 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).add(2).divide(3);
  }
}

