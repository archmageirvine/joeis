package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077081 Fixed point when phi(sigma(n)+phi(n))=A077080 is iterated with initial value of n.
 * @author Sean A. Irvine
 */
public class A077081 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    while (true) {
      final Z s = Functions.PHI.z(Functions.SIGMA1.z(t).add(Functions.PHI.z(t)));
      if (s.equals(t)) {
        return s;
      }
      t = s;
    }
  }
}

