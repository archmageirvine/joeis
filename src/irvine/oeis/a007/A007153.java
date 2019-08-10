package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a000.A000372;

/**
 * A007153 Dedekind numbers: number of monotone Boolean functions or antichains of subsets of an n-set containing at least one nonempty set.
 * @author Sean A. Irvine
 */
public class A007153 extends A000372 {

  @Override
  public Z next() {
    return super.next().subtract(2);
  }
}
