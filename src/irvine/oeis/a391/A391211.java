package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a333.A333242;

/**
 * A391211 allocated for Michael P. May.
 * @author Sean A. Irvine
 */
public class A391211 extends Sequence2 {

  private final Sequence mA = new A333242().skip();

  @Override
  public Z next() {
    final Z t = mA.next();
    return t.subtract(Functions.PREV_PRIME.z(t));
  }
}
