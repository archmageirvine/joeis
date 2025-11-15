package irvine.oeis.a323;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a309.A309874;

/**
 * A323812 a(n) = n*Fibonacci(n-2) + ((-1)^n + 1)/2.
 * @author Georg Fischer
 */
public class A323812 extends Sequence0 {

  private final Sequence mSeq = new PrependSequence(new A309874(), 2, 2);

  @Override
  public Z next() {
    return mSeq.next().divide2();
  }
}
