package irvine.oeis.a158;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a173.A173862;

/**
 * A158772 a(n) = A138635(n+18)-A138635(n).
 * @author Georg Fischer
 */
public class A158772 extends Sequence0 {

  private final A173862 mSeq = new A173862();

  @Override
  public Z next() {
    return mSeq.next().multiply(21);
  }
}
