package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017267 <code>a(n) = (9*n + 8)^11</code>.
 * @author Sean A. Irvine
 */
public class A017267 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(9);
    return mN.pow(11);
  }
}

