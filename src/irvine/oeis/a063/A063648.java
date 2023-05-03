package irvine.oeis.a063;

import irvine.math.z.Z;

/**
 * A063648 Smallest c such that 1/n=1/c+1/b has integer solutions with c&gt;b.
 * @author Sean A. Irvine
 */
public class A063648 extends A063427 {

  @Override
  public Z next() {
    return super.next().add(mN.multiply2());
  }
}
