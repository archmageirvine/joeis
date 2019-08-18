package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * A025199.
 * @author Sean A. Irvine
 */
public class A025199 extends A025193 {

  private final Sequence mS1 = new SkipSequence(new A025224(), 2);

  @Override
  public Z next() {
    return super.next().divide(mS1.next());
  }
}
