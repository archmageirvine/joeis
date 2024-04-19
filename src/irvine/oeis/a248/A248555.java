package irvine.oeis.a248;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A248555 a(n) is the concatenation of 3n-2, 3n and 3n-1.
 * @author Georg Fischer
 */
public class A248555 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return new Z(String.valueOf(3 * mN - 2) + 3 * mN + (3 * mN - 1));
  }
}
