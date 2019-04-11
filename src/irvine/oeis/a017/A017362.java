package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017362 <code>a(n) = (10*n + 7)^10</code>.
 * @author Sean A. Irvine
 */
public class A017362 implements Sequence {

  private Z mN = Z.valueOf(-3);

  @Override
  public Z next() {
    mN = mN.add(10);
    return mN.pow(10);
  }
}

