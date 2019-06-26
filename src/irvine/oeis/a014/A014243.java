package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a090.A090946;

/**
 * A014243 <code>a(n) = ((n+1)-st</code> Lucas number) <code>- (n-th non-Lucas</code> number).
 * @author Sean A. Irvine
 */
public class A014243 extends A000032 {

  private final Sequence mNotLucas = new A090946();

  {
    next();
    next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mNotLucas.next());
  }
}
