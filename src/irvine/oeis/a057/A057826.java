package irvine.oeis.a057;

import java.util.TreeSet;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057826 Greatest number with totient 2n (or zero when no such number exists).
 * @author Sean A. Irvine
 */
public class A057826 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(2);
    final TreeSet<Z> iphi = Euler.inversePhi(mN);
    return iphi.isEmpty() ? Z.ZERO : iphi.last();
  }
}
