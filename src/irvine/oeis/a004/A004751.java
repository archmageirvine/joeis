package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004751.
 * @author Sean A. Irvine
 */
public class A004751 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    do {
      mN = mN.add(1);
    } while (!mN.toString(2).contains("001"));
    return mN;
  }
}

