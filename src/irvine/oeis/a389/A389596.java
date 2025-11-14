package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a024.A024451;

/**
 * A389596 allocated for Pablo Cadena-Urz\u00faa.
 * @author Sean A. Irvine
 */
public class A389596 extends Sequence1 {

  private final Sequence mA = new A024451().skip(2);
  private long mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ZERO : Functions.PRIMORIAL_COUNT.z(mN).multiply(mN).divide2().divide(mA.next());
  }
}

