package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077082 Largest value arising when phi(sigma(n)+phi(n))=A077080 is iterated with initial value of n.
 * @author Sean A. Irvine
 */
public class A077082 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    Z max = t;
    while (true) {
      final Z s = Functions.PHI.z(Functions.SIGMA1.z(t).add(Functions.PHI.z(t)));
      max = max.max(s);
      if (s.equals(t)) {
        return max;
      }
      t = s;
    }
  }
}

