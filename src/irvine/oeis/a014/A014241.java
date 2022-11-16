package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;

/**
 * A014241 a(n) = ((n+1)-st Fibonacci number) - (n-th non-Fibonacci number).
 * @author Sean A. Irvine
 */
public class A014241 extends A000045 {

  private final Sequence mNotFibo = new ComplementSequence(new A000045());

  {
    setOffset(1);
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mNotFibo.next());
  }
}
