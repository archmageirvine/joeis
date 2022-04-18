package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.a182.A182105;

/**
 * A082850 Let S(0) = {}, S(n) = {S(n-1), S(n-1), n}; sequence gives S(infinity).
 * @author Georg Fischer
 */
public class A082850 extends A182105 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().bitLength());
  }
}
