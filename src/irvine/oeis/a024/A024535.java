package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * A024535.
 * @author Sean A. Irvine
 */
public class A024535 extends A024524 {

  private final Sequence mA = new SkipSequence(new A024522(), 2);

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
