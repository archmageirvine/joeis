package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A056346 Number of bracelets of length n using exactly six different colored beads.
 * @author Sean A. Irvine
 */
public class A056346 extends Sequence1 {

  private final Sequence mA = new A056286();
  private final Sequence mB = new A056492();

  @Override
  public Z next() {
    return mA.next().add(mB.next()).divide2();
  }
}
