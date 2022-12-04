package irvine.oeis.a088;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A088442 A linear version of the Josephus problem.
 * @author Georg Fischer
 */
public class A088442 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(((2 * mN + 1) & 0xaaaaaa) + 1);
  }
}
