package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003185 <code>a(n) = (4*n+1)(4*n+5)</code>.
 * @author Sean A. Irvine
 */
public class A003185 implements Sequence {

  private Z mN = Z.valueOf(-3);

  @Override
  public Z next() {
    mN = mN.add(4);
    return mN.multiply(mN.add(4));
  }
}
