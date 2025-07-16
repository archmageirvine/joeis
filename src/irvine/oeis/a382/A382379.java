package irvine.oeis.a382;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000032;

/**
 * A380821.
 * @author Sean A. Irvine
 */
public class A382379 extends Sequence0 {

  private final Sequence mA = new A000032();

  @Override
  public Z next() {
    final Z t = mA.next();
    return t.subtract(1).multiply(t).multiply2();
  }
}
