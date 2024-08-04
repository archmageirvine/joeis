package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a057.A057505;

/**
 * A071661 Permutation A057505 applied twice ("squared").
 * @author Sean A. Irvine
 */
public class A071661 extends Sequence0 {

  private final DirectSequence mA = DirectSequence.create(new A057505());
  private int mN = -1;

  @Override
  public Z next() {
    return mA.a(mA.a(++mN).intValueExact());
  }
}
