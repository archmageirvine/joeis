package irvine.oeis.a117;

import irvine.math.z.Z;
import irvine.oeis.a002.A002865;

/**
 * A117298 Number of partitions of n with unique smallest part and unique largest part.
 * @author Georg Fischer
 */
public class A117298 extends A002865 {

  private int mN = 0;

  /** Construct the sequence. */
  public A117298() {
    super.next();
  }

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    // a(2*n+1)= A002865(2*n+1)+1, a(2*n)= A002865(2*n).
    ++mN;
    return ((mN & 1) == 1) ? super.next().add(1) : super.next();
  }
}
