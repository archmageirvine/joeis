package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070089 P(n) &lt; P(n+1) where P(n) (A006530) is the largest prime factor of n.
 * @author Sean A. Irvine
 */
public class A070089 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.GPF.z(++mN).compareTo(Functions.GPF.z(mN + 1)) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
