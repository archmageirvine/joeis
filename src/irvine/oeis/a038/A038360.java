package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000079;
import irvine.oeis.a000.A000931;

/**
 * A038190.
 * @author Sean A. Irvine
 */
public class A038360 extends A000079 {

  private final Sequence mA = new SkipSequence(new A000931(), 6);
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
