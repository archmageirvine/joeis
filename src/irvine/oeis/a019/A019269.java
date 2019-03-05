package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019269.
 * @author Sean A. Irvine
 */
public class A019269 extends A019268 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(count(++mN));
  }
}
