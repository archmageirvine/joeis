package irvine.oeis.a386;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence3;

/**
 * A386948 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A386948 extends Sequence3 {

  private final Sequence mSeq = new A386482().skip();
  private Z mA = mSeq.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mSeq.next();
    final Z d = mA.subtract(t);
    final long da = d.abs().longValueExact();
    long pos = 0;
    long k = 1;
    while (k != da) {
      if (Functions.GCD.l(t, ++k) > 1) {
        ++pos;
      }
    }
    return Z.valueOf(pos * d.signum());
  }
}
