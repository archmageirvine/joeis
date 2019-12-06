package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a001.A001223;

/**
 * A027833 Distances between successive <code>2</code>'s in sequence <code>A001223</code> of differences between consecutive primes.
 * @author Sean A. Irvine
 */
public class A027833 extends A001223 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    long c = 1;
    while (!Z.TWO.equals(super.next())) {
      ++c;
    }
    return Z.valueOf(c);
  }
}
