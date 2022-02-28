package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000717;
import irvine.oeis.a001.A001437;

/**
 * A054927 Number of connected unlabeled graphs having n nodes and ceiling(n(n-1)/4) edges such that the complement is also connected.
 * @author Sean A. Irvine
 */
public class A054927 extends A054926 {

  private final Sequence mA = new PrependSequence(new A001437(), 1);
  private final Sequence mB = new A000717();

  @Override
  public Z next() {
    return super.next().add(mA.next()).subtract(mB.next());
  }
}
