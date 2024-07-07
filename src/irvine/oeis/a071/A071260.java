package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A071260 Integer part of the geometric mean of the n-th prime prime(n) and the n-th composite number C(n).
 * @author Georg Fischer
 */
public class A071260 extends A000040 {

  {
    setOffset(0);
  }

  private final Sequence mCompos = new A002808();

  @Override
  public Z next() {
    return super.next().multiply(mCompos.next()).sqrt();
  }
}
