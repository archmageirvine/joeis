package irvine.oeis.a049;

import java.util.TreeSet;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049283 a(n) is the smallest k such that phi(k)=n, where phi is Euler's totient function.
 * @author Sean A. Irvine
 */
public class A049283 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final TreeSet<Z> inv = Euler.inversePhi(mN);
    return inv.isEmpty() ? Z.ZERO : inv.first();
  }
}
