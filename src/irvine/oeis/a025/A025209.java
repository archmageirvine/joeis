package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * A025209.
 * @author Sean A. Irvine
 */
public class A025209 extends A025202 {

  private final Sequence mS1 = new SkipSequence(new A025201(), 2);

  @Override
  public Z next() {
    return super.next().divide(mS1.next());
  }
}
