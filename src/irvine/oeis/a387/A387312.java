package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A387312 a(n) is the action of "Rule 30" elementary cellular automaton on the binary representation of n if the cells may only expand into the significant bit.
 * @author Sean A. Irvine
 */
public class A387312 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf((2 * ++mN | mN) ^ (mN / 2));
  }
}
