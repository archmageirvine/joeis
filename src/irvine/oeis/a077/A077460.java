package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a005.A005315;
import irvine.oeis.a005.A005316;
import irvine.oeis.a060.A060206;

/**
 * A077459.
 * @author Sean A. Irvine
 */
public class A077460 extends Sequence0 {

  private long mN = -1;
  private final Sequence mA005316 = new A005316();
  private final Sequence mA005315 = new A005315();
  private final Sequence mA060206 = new A060206();

  @Override
  public Z next() {
    if ((++mN & 1) == 0) {
      return mA005315.next().add(mA005316.next().multiply2()).divide(4).max(Z.ONE);
    } else {
      return mA005315.next().add(mA005316.next()).add(mA060206.next()).divide(4).max(Z.ONE);
    }
  }
}
