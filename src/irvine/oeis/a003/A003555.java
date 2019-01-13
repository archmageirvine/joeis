package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003555.
 * @author Sean A. Irvine
 */
public class A003555 implements Sequence {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(10);
    final Z t = mA.subtract(1).divide(9);
    return t.multiply(t.add(1)).divide2();
  }
}
