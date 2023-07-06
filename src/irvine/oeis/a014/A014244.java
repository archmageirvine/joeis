package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000032;

/**
 * A014244 (n-th Lucas number that is not 1) - (n-th number that is 1 or not a Lucas number).
 * @author Sean A. Irvine
 */
public class A014244 extends A000032 {

  private final Sequence mNotLucas = new ComplementSequence(new A000032().skip(2), Z.ONE);

  {
    setOffset(1);
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mNotLucas.next());
  }
}
