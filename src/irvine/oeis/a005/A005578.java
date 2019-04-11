package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005578 <code>a(2*n) = 2*a(2*n-1), a(2*n+1) = 2*a(2*n)-1</code>.
 * @author Sean A. Irvine
 */
public class A005578 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).add(2).divide(3);
  }
}

