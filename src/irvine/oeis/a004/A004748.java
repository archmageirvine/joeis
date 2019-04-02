package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004748 Binary expansion contains 101.
 * @author Sean A. Irvine
 */
public class A004748 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    do {
      mN = mN.add(1);
    } while (!mN.toString(2).contains("101"));
    return mN;
  }
}

