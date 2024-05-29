package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a065.A065498;

/**
 * A069920 Noninvertible n X n matrices mod 6 (i.e., over the ring Z_6).
 * @author Sean A. Irvine
 */
public class A069920 extends Sequence1 {

  private final Sequence mA = new A065498().skip();
  private long mN = 0;

  @Override
  public Z next() {
    return Z.SIX.pow(++mN * mN).subtract(mA.next());
  }
}
