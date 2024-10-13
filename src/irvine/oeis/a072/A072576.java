package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a008.A008289;

/**
 * A072576 Limit of number of compositions (ordered partitions) of m into distinct parts where largest part is exactly m-n, for m sufficiently large given n.
 * @author Sean A. Irvine
 */
public class A072576 extends A008289 {

  /** Construct the sequence. */
  public A072576() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Integers.SINGLETON.sum(0, (Functions.SQRT.i(8 * mN + 1) - 1) / 2, k -> get(mN, k).multiply(Functions.FACTORIAL.z(k + 1)));
  }
}
