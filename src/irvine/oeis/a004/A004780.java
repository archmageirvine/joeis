package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004780 Binary expansion contains 2 adjacent <code>1</code>'s.
 * @author Sean A. Irvine
 */
public class A004780 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    do {
      mN = mN.add(1);
    } while (!mN.toString(2).contains("11"));
    return mN;
  }
}

