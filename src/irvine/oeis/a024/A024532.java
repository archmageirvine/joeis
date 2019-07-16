package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a014.A014284;

/**
 * A024532.
 * @author Sean A. Irvine
 */
public class A024532 extends A024523 {

  private final Sequence mA = new SkipSequence(new A014284(), 2);

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
