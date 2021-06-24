package irvine.oeis.a171;
// manually 2021-06-24

import irvine.math.z.Z;
import irvine.oeis.a018.A018252;

/**
 * A171523 a(n) = n*(n-th nonprime number).
 * @author Georg Fischer
 */
public class A171523 extends A018252 {

  protected int mN = 0;
  
  @Override
  public Z next() {
    ++mN;
    return super.next().multiply(Z.valueOf(mN));
  } // next
}
