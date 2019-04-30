package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a092.A092487;

/**
 * A006255 R. L. Graham's sequence: <code>a(n) =</code> smallest m for which there is a sequence <code>n =</code> b_1 &lt; b_2 <code>&lt; ... &lt</code>; b_t = m such that b_1*b_2*...*b_t is a perfect square.
 * @author Sean A. Irvine
 */
public class A006255 extends A092487 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().add(++mN);
  }
}
