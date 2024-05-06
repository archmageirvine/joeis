package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a065.A065128;

/**
 * A069522.
 * @author Sean A. Irvine
 */
public class A069580 extends Sequence1 {

  private final Sequence mA = new A065128().skip();
  private long mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(2 * ++mN * mN).subtract(mA.next());
  }
}
