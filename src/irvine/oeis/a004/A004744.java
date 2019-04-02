package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004744 Numbers n such that binary expansion does not contain 011.
 * @author Sean A. Irvine
 */
public class A004744 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    do {
      mN = mN.add(1);
    } while (mN.toString(2).contains("011"));
    return mN;
  }
}

