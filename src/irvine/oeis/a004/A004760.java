package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004760 List of numbers whose binary expansion does not begin 10.
 * @author Sean A. Irvine
 */
public class A004760 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    do {
      mN = mN.add(1);
    } while (mN.toString(2).startsWith("10"));
    return mN;
  }
}

