package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004779 Binary expansion contains 3 adjacent 0's.
 * @author Sean A. Irvine
 */
public class A004779 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    do {
      mN = mN.add(1);
    } while (!mN.toString(2).contains("000"));
    return mN;
  }
}

