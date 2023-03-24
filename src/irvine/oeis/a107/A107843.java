package irvine.oeis.a107;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A107843 Number of iterations of McCarthy 91 Function until it terminates.
 * <code>a(n) = 203 - 2*n for n < 101, a(n)=1 for n > 100.</code>
 * @author Georg Fischer
 */
public class A107843 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return (mN <= 100) ? Z.valueOf(203).subtract(2 * mN) : Z.ONE;
  }
}
