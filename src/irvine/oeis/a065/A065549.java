package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a000.A000043;

/**
 * A065549 a(1) = 1; for n &gt; 1, a(n) = 2^((A000043(n) - 1)/2).
 * @author Sean A. Irvine
 */
public class A065549 extends Sequence2 {

  private final Sequence mA = new A000043().skip();

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(mA.next().subtract(1).divide2().longValueExact());
  }
}

