package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a014.A014284;

/**
 * A024531.
 * @author Sean A. Irvine
 */
public class A024531 extends A024522 {

  private final Sequence mA = new SkipSequence(new A014284(), 1);

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
