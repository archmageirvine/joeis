package irvine.oeis.a133;

import irvine.math.z.Z;
import irvine.oeis.a111.A111575;

/**
 * A133463 Partial sums of the sequence that starts with 2 and is followed by A111575.
 * @author Georg Fischer
 */
public class A133463 extends A111575 {

  private int mN = -1;

  @Override
  public Z next() {
    // a(4n) = 2*A111575(4n). a(4n+1)= 3*A111575(4n+1). a(4n+2)= 4*A111575(4n+2). a(4n+3)= 5*A111575(4n+3).
    ++mN;
    return super.next().multiply(mN % 4 + 2);
  }
}
