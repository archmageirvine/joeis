package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082751 Prime formed by concatenation of elements in rows of A082750.
 * @author Sean A. Irvine
 */
public class A082751 extends A082750 {

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
