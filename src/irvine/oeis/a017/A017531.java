package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017531 (12n)^11.
 * @author Sean A. Irvine
 */
public class A017531 implements Sequence {

  private Z mN = Z.valueOf(-12);

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(11);
  }
}

