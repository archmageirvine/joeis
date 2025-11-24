package irvine.oeis.a082;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A082190 Antidiagonal sums of square array A082025.
 * @author Sean A. Irvine
 */
public class A082190 extends A082025 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}
