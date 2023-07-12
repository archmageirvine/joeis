package irvine.oeis.a325;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000045;

/**
 * A325174 a(n) = Fibonacci(n)^n mod prime(n).
 * @author Georg Fischer
 */
public class A325174 extends A000045 {

  private int mN = 0;
  private final Sequence mSeq = new A000040();

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().pow(mN).mod(mSeq.next());
  }
}
