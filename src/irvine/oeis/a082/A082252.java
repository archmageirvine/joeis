package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082252 Concatenation of (3n-2), (3n-1) and 3n divided by 3.
 * @author Georg Fischer
 */
public class A082252 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return new Z(String.valueOf(3 * mN - 2) + String.valueOf(3 * mN - 1) + String.valueOf(3 * mN)).divide(3);
  }
}
