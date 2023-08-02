package irvine.oeis.a215;
// manually A144613/parm2 at 2022-11-25 11:43

import irvine.math.z.Z;
import irvine.oeis.a144.A144613;

/**
 * A215942 a(n) = sigma(6*n) - 12*n.
 * @author Georg Fischer
 */
public class A215942 extends A144613 {

  /** Construct the sequence. */
  public A215942() {
    super(6);
  }

  @Override
  public Z next() {
    return super.next().subtract(12L * mN);
  }
}
