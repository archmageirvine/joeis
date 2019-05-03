package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;

/**
 * A014242 <code>(n-th</code> Fibonacci number that is not <code>1) - (n-th</code> number that is 1 or not a Fibonacci number).
 * @author Sean A. Irvine
 */
public class A014242 extends A000045 {

  private final Sequence mNotFibo = new ComplementSequence(new SkipSequence(new A000045(), 3), Z.ONE);

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mNotFibo.next());
  }
}
