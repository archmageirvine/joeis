package irvine.oeis.a366;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000073;

/**
 * A366773.
 * @author Sean A. Irvine
 */
public class A366784 extends Sequence1 {

  private final Sequence mA = new A000073().skip(2);

  @Override
  public Z next() {
    return Euler.phi(mA.next());
  }
}
