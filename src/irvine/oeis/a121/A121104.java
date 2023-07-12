package irvine.oeis.a121;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000045;

/**
 * A121104 a(n) = Fibonacci(n - 1) modulo the n-th prime number.
 * @author Georg Fischer
 */
public class A121104 extends A000045 {

  private int mN = 1;
  private final Sequence mSeq = new A000040();

  {
    setOffset(2);
    super.next();
    mSeq.next();
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().mod(mSeq.next());
  }
}
