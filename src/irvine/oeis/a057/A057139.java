package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057139 Odd number of digits palindrome based on sequential digits.
 * @author Sean A. Irvine
 */
public class A057139 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (int k = 1; k <= mN; ++k) {
      sb.append(k % 10);
    }
    for (int k = mN - 1; k > 0; --k) {
      sb.append(k % 10);
    }
    return new Z(sb);
  }
}
