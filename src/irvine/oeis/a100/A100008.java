package irvine.oeis.a100;

import irvine.math.z.Z;
import irvine.oeis.a068.A068068;

/**
 * A100008 Number of unitary divisors of 2n.
 * @author Georg Fischer
 */
public class A100008 extends A068068 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
