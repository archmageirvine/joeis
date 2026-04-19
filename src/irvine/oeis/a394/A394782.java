package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394782 allocated for Alain Rocchelli.
 * @author Sean A. Irvine
 */
public class A394782 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z p = Functions.PRIMORIAL_COUNT.z(++mN);
    long d = 0;
    while (true) {
      final Z[] qr = p.divideAndRemainder(++d);
      if (qr[1].isZero() && qr[0].add(d).isProbablePrime()) {
        return qr[0].add(d);
      }
    }
  }
}
