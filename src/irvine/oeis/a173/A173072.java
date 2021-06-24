package irvine.oeis.a173;
// manually 2021-06-24

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A173072 n-th prime minus n-th even number.
 * @author Georg Fischer
 */
public class A173072 extends A000040 {

  protected int mN = -2;
  
  @Override
  public Z next() {
    mN += 2;
    return super.next().subtract(Z.valueOf(mN));
  } // next
}
