package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065557 Solutions k of the equation phi(k) = phi(k-1) + phi(k-2). Also known as Phibonacci numbers.
 * @author Sean A. Irvine
 */
public class A065557 extends Sequence1 {

  private long mN = 2;
  private Z mA = Functions.PHI.z(1L);
  private Z mB = Functions.PHI.z(2L);

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.add(mB);
      mA = mB;
      final long n = ++mN;
      mB = Functions.PHI.z(n);
      if (mB.equals(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}
