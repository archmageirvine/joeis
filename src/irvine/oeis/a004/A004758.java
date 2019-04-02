package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004758 Binary expansion starts 110.
 * @author Sean A. Irvine
 */
public class A004758 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    do {
      mN = mN.add(1);
    } while (!mN.toString(2).startsWith("110"));
    return mN;
  }
}

