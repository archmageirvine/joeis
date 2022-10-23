package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004752 Binary expansion contains 010.
 * @author Sean A. Irvine
 */
public class A004752 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    do {
      mN = mN.add(1);
    } while (!mN.toString(2).contains("010"));
    return mN;
  }
}

