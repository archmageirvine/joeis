package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017039 <code>a(n) = (7*n + 4)^11</code>.
 * @author Sean A. Irvine
 */
public class A017039 implements Sequence {

  private Z mN = Z.valueOf(-3);

  @Override
  public Z next() {
    mN = mN.add(7);
    return mN.pow(11);
  }
}

