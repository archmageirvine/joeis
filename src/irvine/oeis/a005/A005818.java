package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005818 Numbers n that are primitive solutions to <code>n^2 = a^2 +</code> b^2 + c^2 <code>(a</code>,b,c <code>&gt; 0)</code>.
 * @author Sean A. Irvine
 */
public class A005818 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(2);
    if (Z.FIVE.equals(mN)) {
      mN = mN.add(2);
    }
    return mN;
  }
}
