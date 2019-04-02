package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004742 Numbers n such that binary expansion does not contain 101.
 * @author Sean A. Irvine
 */
public class A004742 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    do {
      mN = mN.add(1);
    } while (mN.toString(2).contains("101"));
    return mN;
  }
}

