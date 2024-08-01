package irvine.oeis.a049;

import java.util.TreeSet;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049283 a(n) is the smallest k such that phi(k)=n, where phi is Euler's totient function, or a(n) = 0 if no such k exists.
 * @author Sean A. Irvine
 */
public class A049283 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final TreeSet<Z> inv = InverseEuler.inversePhi(mN);
    return inv.isEmpty() ? Z.ZERO : inv.first();
  }
}
