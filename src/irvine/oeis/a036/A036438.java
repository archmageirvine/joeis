package irvine.oeis.a036;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036438 Integers which can be written as m*tau(m) for some m, where tau = A000005.
 * @author Sean A. Irvine
 */
public class A036438 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mN) >= 0) {
      mA.add(Functions.SIGMA0.z(mN).multiply(mN));
      mN = mN.add(1);
    }
    return mA.pollFirst();
  }
}
