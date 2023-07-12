package irvine.oeis.a168;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000005;
import irvine.oeis.a000.A000045;

/**
 * A168138 a(n) = Fibonacci(n+1)^tau(n).
 * @author Georg Fischer
 */
public class A168138 extends A000045 {

  private final Sequence mSeq = new A000005();

  {
    setOffset(1);
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().pow(mSeq.next().intValue());
  }
}
