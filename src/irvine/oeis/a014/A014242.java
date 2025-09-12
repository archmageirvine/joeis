package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;

/**
 * A014242 (n-th Fibonacci number that is not 1) - (n-th number that is 1 or not a Fibonacci number).
 * @author Sean A. Irvine
 */
public class A014242 extends A000045 {

  private final Sequence mNotFibo = new ComplementSequence(Z.ONE, new A000045().skip(3));

  {
    setOffset(1);
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mNotFibo.next());
  }
}
