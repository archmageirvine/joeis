package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017172 (9*n)^12.
 * @author Sean A. Irvine
 */
public class A017172 implements Sequence {

  private Z mN = Z.valueOf(-9);

  @Override
  public Z next() {
    mN = mN.add(9);
    return mN.pow(12);
  }
}

