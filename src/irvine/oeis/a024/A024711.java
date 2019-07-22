package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024711 <code>a(n) =</code> residue <code>mod 2</code> of n-th term of <code>A024702</code>.
 * @author Sean A. Irvine
 */
public class A024711 extends A024702 {

  @Override
  public Z next() {
    return super.next().and(Z.ONE);
  }
}
