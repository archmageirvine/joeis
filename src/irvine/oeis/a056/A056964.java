package irvine.oeis.a056;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056964 a(n) = n + reversal of digits of n.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A056964 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Functions.REVERSE_AND_ADD.z(++mN);
  }
}
