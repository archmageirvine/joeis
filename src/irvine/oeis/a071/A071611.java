package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005875;

/**
 * A071611 Number of points (i,j,k) on the surface of a sphere around (0,0,0) with squared radius A071609(n).
 * @author Sean A. Irvine
 */
public class A071611 extends Sequence1 {

  private final Sequence mA = new A071609();
  private final DirectSequence mB = DirectSequence.create(new A005875());

  @Override
  public Z next() {
    return mB.a(mA.next());
  }
}
