package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082254 Concatenation of (6n-5), (6n-4), (6n-3), (6n-2), (6n-1) and 6n divided by 6.
 * @author Georg Fischer
 */
public class A082254 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return new Z(String.valueOf(6 * mN - 5) + (6 * mN - 4) + (6 * mN - 3) + (6 * mN - 2) + (6 * mN - 1) + 6 * mN).divide(6);
  }
}
