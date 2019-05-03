package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004749 Numbers whose binary expansion contains the substring <code>'110'</code>.
 * @author Sean A. Irvine
 */
public class A004749 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    do {
      mN = mN.add(1);
    } while (!mN.toString(2).contains("110"));
    return mN;
  }
}

