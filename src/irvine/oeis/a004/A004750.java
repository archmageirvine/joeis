package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004750 Numbers whose binary expansion contains the substring <code>'011'</code>.
 * @author Sean A. Irvine
 */
public class A004750 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    do {
      mN = mN.add(1);
    } while (!mN.toString(2).contains("011"));
    return mN;
  }
}

