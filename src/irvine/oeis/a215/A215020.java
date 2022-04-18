package irvine.oeis.a215;

import irvine.math.z.Z;
import irvine.oeis.a182.A182105;

/**
 * A215020 a(n) = log_2( A182105(n) ).
 * @author Georg Fischer
 */
public class A215020 extends A182105 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().bitLength() - 1);
  }
}
