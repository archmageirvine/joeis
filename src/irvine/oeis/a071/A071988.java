package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A071988 Triple Peano sequence: a list of triples (x,y,z) starting at (1,1,1); then x'=x+1, y'=y+x, z'=z+y, for x only ranging over the primes.
 * @author Sean A. Irvine
 */
public class A071988 extends A000040 {

  private Z mB = null;
  private Z mC = null;

  @Override
  public Z next() {
    if (mC == null) {
      final Z p = super.next();
      mB = p.multiply(p.subtract(1)).divide2().add(1);
      mC = p.pow(3).subtract(p.square().multiply(3)).add(p.multiply(8)).divide(6);
      return p;
    }
    if (mB != null) {
      final Z res = mB;
      mB = null;
      return res;
    }
    final Z res = mC;
    mC = null;
    return res;
  }
}
