package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007997 a(n) = ceiling((n-3)(n-4)/6).
 * @author Sean A. Irvine
 */
public class A007997 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = mN;
    mN = mN.add(1);
    return t.multiply(mN).add(5).divide(6);
  }
}
