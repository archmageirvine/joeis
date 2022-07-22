package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a051.A051451;

/**
 * A058024 a(n) = A051451(n) - A058023(n).
 * @author Sean A. Irvine
 */
public class A058024 extends A051451 {

  private final Sequence mA = new A058023();
  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
