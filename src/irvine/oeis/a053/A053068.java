package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A053068 Concatenation of next n Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A053068 extends A000045 {

  private long mN = 0;
  {
    setOffset(1);
    super.next(); // skip 0
  }

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (long k = 0; k < mN; ++k) {
      sb.append(super.next());
    }
    return new Z(sb);
  }
}
