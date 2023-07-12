package irvine.oeis.a342;

import irvine.math.z.Z;
import irvine.oeis.a001.A001952;

/**
 * A342280 a(n) = A001952(2*n+1).
 * @author Georg Fischer
 */
public class A342280 extends A001952 {

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    return result;
  }
}
