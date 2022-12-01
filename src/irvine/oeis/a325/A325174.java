package irvine.oeis.a325;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000045;

/**
 * A325174 a(n) = Fibonacci(n) * A004018(n) for n>=1 with a(0)=1, where A004018(n) is the number of ways of writing n as a sum of 2 squares.
 * @author Georg Fischer
 */
public class A325174 extends A000045 {

  private int mN = 0;
  private final Sequence mSeq = new A000040();

  {
    super.next();
  }

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().pow(mN).mod(mSeq.next());
  }
}
