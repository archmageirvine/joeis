package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085931 Leading diagonal of A085930.
 * @author Sean A. Irvine
 */
public class A085931 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Functions.TRIANGULAR.z(Functions.TRINV.z(mN).add(mN)).subtract(mN);
  }
}
