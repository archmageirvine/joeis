package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004762 Numbers whose binary expansion does not begin 100.
 * @author Sean A. Irvine
 */
public class A004762 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    do {
      mN = mN.add(1);
    } while (mN.toString(2).startsWith("100"));
    return mN;
  }
}

