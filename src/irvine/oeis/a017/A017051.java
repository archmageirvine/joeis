package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017051.
 * @author Sean A. Irvine
 */
public class A017051 implements Sequence {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(7);
    return mN.pow(11);
  }
}

