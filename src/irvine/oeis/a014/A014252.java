package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000032;

/**
 * A014252 a(n) = b(n) - c(n) where b(n) is the n-th Lucas number greater than 3 and c(n) is the n-th number not in sequence b( ).
 * @author Sean A. Irvine
 */
public class A014252 extends A000032 {

  private final Sequence mA = new ComplementSequence(new A000032().skip(3), Z.ONE);

  {
    setOffset(1);
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
