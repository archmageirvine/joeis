package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000267;

/**
 * A055086 n appears 1+[n/2] times.
 * @author Georg Fischer
 */
public class A055086 extends Sequence0 {

  private final Sequence mA000267 = new A000267();

  @Override
  public Z next() {
    return mA000267.next().subtract(Z.ONE);
  }
}
