package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;

/**
 * A014251 a(n) = b(n) - c(n) where b(n) is the n-th Fibonacci number greater than 2 and c(n) is the n-th number not in sequence b( ).
 * @author Sean A. Irvine
 */
public class A014251 extends A000045 {

  private final Sequence mA = new ComplementSequence(new A000045().skip(4), Z.ONE);

  {
    setOffset(1);
    super.next();
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
