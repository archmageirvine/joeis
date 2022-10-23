package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A007851 Number of elements w of the Weyl group D(n) such that the roots sent negative by w span an Abelian subalgebra of the Lie algebra.
 * @author Sean A. Irvine
 */
public class A007851 extends A000108 {

  private long mN = 3;
  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    return super.next().multiply(++mN).divide2().subtract(1);
  }
}
