package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A071926.
 * @author Sean A. Irvine
 */
public class A069443 extends Sequence1 {

  private final Sequence mA = new A069380();
  private final Sequence mB = new A069405();
  private long mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(5 * ++mN - 1).subtract(mA.next()).add(mB.next());
  }
}
