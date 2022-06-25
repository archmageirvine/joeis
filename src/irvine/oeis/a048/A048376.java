package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a057.A057692;

/**
 * A048376 Replace each 1 in decimal expansion of n with 1 1's, each 2 with 2 2's, etc. (0 vanishes).
 * @author Sean A. Irvine
 */
public class A048376 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return A057692.expand(Z.valueOf(++mN));
  }
}
