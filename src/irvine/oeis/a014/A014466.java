package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000372;

/**
 * A014466 Dedekind numbers: monotone Boolean functions, or nonempty antichains of subsets of an <code>n-set</code>.
 * @author Sean A. Irvine
 */
public class A014466 extends A000372 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
