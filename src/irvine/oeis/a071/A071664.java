package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a057.A057506;

/**
 * A071664 Permutation A057506 applied three times ("cubed").
 * @author Sean A. Irvine
 */
public class A071664 extends Sequence0 {

  private final DirectSequence mA = DirectSequence.create(new A057506());
  private int mN = -1;

  @Override
  public Z next() {
    return mA.a(mA.a(mA.a(++mN).intValueExact()).intValueExact());
  }
}
