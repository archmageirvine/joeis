package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004745 Numbers whose binary expansion does not contain 001.
 * @author Sean A. Irvine
 */
public class A004745 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    do {
      mN = mN.add(1);
    } while (mN.toString(2).contains("001"));
    return mN;
  }
}

