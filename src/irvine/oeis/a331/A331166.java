package irvine.oeis.a331;

import irvine.math.z.Z;
import irvine.oeis.a057.A057889;

/**
 * A331166 a(n) = min(n, A057889(n)), where A057889 is bijective base-2 reverse.
 * @author Georg Fischer
 */
public class A331166 extends A057889 {

  private int mN = -1;

  @Override
  public Z next() {
    return super.next().min(Z.valueOf(++mN));
  }
}
