package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a056.A056239;

/**
 * A082090 Length of iteration sequence if function A056239, a pseudo-logarithm is iterated and started at n. Fixed point equals zero for all initial values.
 * @author Sean A. Irvine
 */
public class A082090 extends Sequence1 {

  private final DirectSequence mA = new A056239();
  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    long cnt = 1;
    while (!t.isZero()) {
      ++cnt;
      t = mA.a(t);
    }
    return Z.valueOf(cnt);
  }
}
