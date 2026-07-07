package irvine.oeis.a085;

import java.util.Collection;

import irvine.math.function.Functions;
import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.a008.A008578;

/**
 * A085713 Consider numbers k such that phi(x) = k has exactly 3 solutions and they are (3*p, 4*p, 6*p) where p is 1 or a prime. Sequence gives values of p.
 * @author Sean A. Irvine
 */
public class A085713 extends A008578 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Collection<Z> inv = InverseEuler.inversePhi(Functions.PHI.z(p.multiply(3)));
      if (inv.size() == 3 && inv.contains(p.multiply(4)) && inv.contains(p.multiply(6))) {
        return p;
      }
    }
  }
}
