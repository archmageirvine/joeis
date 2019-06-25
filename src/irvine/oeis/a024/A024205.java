package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * A024205.
 * @author Sean A. Irvine
 */
public class A024205 extends A024198 {

  private final Sequence mA = new SkipSequence(new A024196(), 2);

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}

