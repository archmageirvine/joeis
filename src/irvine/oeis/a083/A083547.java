package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083547 a(n) = sqrt(sqrt(phi(A083546(n)) * phi(1+A083546(n)))), the 4th root of product of totients of terms and 1+terms of A082788.
 * @author Sean A. Irvine
 */
public class A083547 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = Functions.PHI.z(++mN).multiply(Functions.PHI.z(mN + 1));
      final Z s = t.root(4);
      if (t.auxiliary() == 1) {
        return s;
      }
    }
  }
}

