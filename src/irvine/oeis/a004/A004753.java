package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004753 Numbers whose binary expansion contains 100.
 * @author Sean A. Irvine
 */
public class A004753 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    do {
      mN = mN.add(1);
    } while (!mN.toString(2).contains("100"));
    return mN;
  }
}

