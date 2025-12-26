package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082828 Palindrome corresponding to row n of A082827.
 * @author Sean A. Irvine
 */
public class A082828 extends A082827 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < mN; ++k) {
      sb.append(super.next());
    }
    return new Z(sb);
  }
}
