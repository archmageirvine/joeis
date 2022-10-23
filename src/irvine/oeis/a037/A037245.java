package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.SkipSequence;
import irvine.oeis.a001.A001411;
import irvine.oeis.a323.A323188;
import irvine.oeis.a323.A323189;

/**
 * A037245 Number of unrooted self-avoiding walks of n steps on square lattice.
 * @author Sean A. Irvine
 */
public class A037245 extends Sequence1 {

  private final Sequence mA = new SkipSequence(new A001411(), 1);
  private final Sequence mB = new A323188();
  private final Sequence mC = new A323189();

  @Override
  public Z next() {
    return mA.next().add(mB.next()).add(mC.next()).add(4).divide(16);
  }
}
