package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004767 <code>a(n) = 4*n + 3</code>.
 * @author Sean A. Irvine
 */
public class A004767 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(4);
    return mN;
  }
}

