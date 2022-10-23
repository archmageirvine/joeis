package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004742 Numbers whose binary expansion does not contain 101.
 * @author Sean A. Irvine
 */
public class A004742 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    do {
      mN = mN.add(1);
    } while (mN.toString(2).contains("101"));
    return mN;
  }
}

