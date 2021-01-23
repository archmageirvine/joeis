package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024711 a(n) = residue mod 2 of n-th term of A024702.
 * @author Sean A. Irvine
 */
public class A024711 extends A024702 {

  @Override
  public Z next() {
    return super.next().and(Z.ONE);
  }
}
