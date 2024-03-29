package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000108;

/**
 * A028302 a(n) = prime(n)*Catalan(n).
 * @author Sean A. Irvine
 */
public class A028302 extends A000040 {

  private final Sequence mCatalan = new A000108().skip(1);

  @Override
  public Z next() {
    return super.next().multiply(mCatalan.next());
  }
}

