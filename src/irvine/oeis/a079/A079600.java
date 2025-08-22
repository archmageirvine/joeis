package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000670;
import irvine.oeis.a065.A065091;

/**
 * A079600 a(n) = A000670(p-1)/p with p = prime(n+1).
 * @author Sean A. Irvine
 */
public class A079600 extends A065091 {

  private final DirectSequence mFubini = new A000670();

  @Override
  public Z next() {
    final Z p = super.next();
    return mFubini.a(p.subtract(1)).divide(p);
  }
}
