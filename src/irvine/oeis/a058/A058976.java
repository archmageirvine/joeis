package irvine.oeis.a058;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058976 Number of inequivalent n-variable 3-valued Post functions under action of complementing group D(n,3).
 * @author Sean A. Irvine
 */
public class A058976 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> Binomial.binomial(mN, k).multiply(Z.THREE.pow(Z.THREE.pow(mN - k).add(Z.THREE.pow(mN)).divide2()))).shiftRight(mN);
  }
}
