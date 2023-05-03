package irvine.oeis.a063;

import irvine.math.z.Z;

/**
 * A063649 Largest b such that 1/n=1/c+1/b has integer solutions with c&gt;b.
 * @author Sean A. Irvine
 */
public class A063649 extends A063428 {

  @Override
  public Z next() {
    return super.next().negate().add(mN.multiply2());
  }
}
