package irvine.oeis.a205;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a004.A004018;

/**
 * A205507 a(n) = Fibonacci(n) * A004018(n) for n&gt;=1 with a(0)=1, where A004018(n) is the number of ways of writing n as a sum of 2 squares.
 * @author Georg Fischer
 */
public class A205507 extends A000045 {

  private int mN = -1;
  private final Sequence mSeq = new A004018();

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      super.next();
      mSeq.next();
      return Z.ONE;
    }
    return super.next().multiply(mSeq.next());
  }
}
