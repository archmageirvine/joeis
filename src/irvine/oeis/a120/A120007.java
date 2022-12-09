package irvine.oeis.a120;
// manually anopan 

import irvine.math.z.Z;
import irvine.oeis.a014.A014963;

/**
 * A120007 Mobius transform of sum of prime factors of n with multiplicity (A001414).
 * @author Georg Fischer
 */
public class A120007 extends A014963 {

  @Override
  public Z next() {
    final Z result = super.next();
    return result.equals(Z.ONE) ? Z.ZERO : result;
  }
}
