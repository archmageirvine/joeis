package irvine.oeis.a205;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A205505 Fibonacci(n*(n+1)) / Fibonacci(n).
 * @author Georg Fischer
 */
public class A205505 extends Sequence1 {

  private int mN = 0;
  private final AbstractSequence mSeq = new A000045().skip();

  @Override
  public Z next() {
    ++mN;
    return Fibonacci.fibonacci(mN * (mN + 1)).divide(mSeq.next());
  }
}
