package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017207 <code>a(n) = (9*n + 3)^11</code>.
 * @author Sean A. Irvine
 */
public class A017207 implements Sequence {

  private Z mN = Z.valueOf(-6);

  @Override
  public Z next() {
    mN = mN.add(9);
    return mN.pow(11);
  }
}

