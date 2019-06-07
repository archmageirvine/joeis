package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003188 Decimal equivalent of Gray code for <code>n</code>.
 * @author Sean A. Irvine
 */
public class A003188 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.xor(mN.divide2());
  }
}
