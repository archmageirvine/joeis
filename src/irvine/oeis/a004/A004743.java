package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004743 Numbers whose binary expansion does not contain 110.
 * @author Sean A. Irvine
 */
public class A004743 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    do {
      mN = mN.add(1);
    } while (mN.toString(2).contains("110"));
    return mN;
  }
}

