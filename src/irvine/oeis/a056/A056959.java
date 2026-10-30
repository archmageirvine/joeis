package irvine.oeis.a056;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056959 a(n) is the maximum of the orbit of n under iterations of the Collatz or 3x+1 function A006370 (x/2 if even, 3x+1 else), or 0 if the orbit is unbounded.
 * @author Sean A. Irvine
 */
public class A056959 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final TreeSet<Z> seq = new TreeSet<>();
    Z m = mN;
    while (seq.add(m)) {
      m = m.isEven() ? m.divide2() : m.multiply(3).add(1);
    }
    return seq.last();
  }
}
