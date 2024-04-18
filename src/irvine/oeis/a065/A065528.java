package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065528 Numbers n such that phi(n) is a nontrivial power b^c where b &gt; 1 and c &gt; 1.
 * @author Sean A. Irvine
 */
public class A065528 extends Sequence1 {

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      final long n = ++mN;
      if (Functions.PHI.z(n).isPower() != null) {
        return Z.valueOf(mN);
      }
    }
  }
}
