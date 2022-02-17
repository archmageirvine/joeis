package irvine.oeis.a046;

import irvine.math.IntegerUtils;
import irvine.math.Mobius;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046209 Number of ternary Lyndon words whose digits sum to 0 mod 3; also number of trace 0 irreducible polynomials over GF(3).
 * @author Sean A. Irvine
 */
public class A046209 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Z.THREE.pow(mN / d).multiply(IntegerUtils.gcd(d, 3)).multiply(Mobius.mobius(d))).divide(3L * mN);
  }
}
