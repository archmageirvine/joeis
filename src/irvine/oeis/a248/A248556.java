package irvine.oeis.a248;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A248556 Concatenate (3n-2,3n-1,3n).
 * @author Georg Fischer
 */
public class A248556 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return new Z(String.valueOf(3 * mN - 2) + (3 * mN - 1) + 3 * mN);
  }
}
