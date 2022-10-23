package irvine.oeis.a057;

import java.util.TreeSet;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057635 a(n) is the largest m such that phi(m) = n, where phi is Euler's totient function = A000010, or a(n) = 0 if no such m exists.
 * @author Sean A. Irvine
 */
public class A057635 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final TreeSet<Z> iphi = Euler.inversePhi(mN);
    return iphi.isEmpty() ? Z.ZERO : iphi.last();
  }
}
