package irvine.oeis.a086;
// manually 2021-09-25

import irvine.math.z.Z;
import irvine.oeis.a000.A000166;

/**
 * A086325 Let u(1)=0, u(2)=1, u(k)=u(k-1)+u(k-2)/(k-2); then a(n)=n!*u(n). 
 * @author Georg Fischer
 */
public class A086325 extends A000166 {

  protected int mN;

  /** Construct the sequence. */
  public A086325() {
    super.next(); // skip A000166(0)
    mN = 0;
  }

  @Override
  public Z next() {
    return super.next().multiply(++mN);
  }
}
