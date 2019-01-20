package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017652.
 * @author Sean A. Irvine
 */
public class A017652 implements Sequence {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(12);
  }
}

