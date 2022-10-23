package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A056345 Number of bracelets of length n using exactly five different colored beads.
 * @author Sean A. Irvine
 */
public class A056345 extends Sequence1 {

  private final Sequence mA = new A056285();
  private final Sequence mB = new A056491();

  @Override
  public Z next() {
    return mA.next().add(mB.next()).divide2();
  }
}
