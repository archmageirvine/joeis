package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a093.A093729;

/**
 * A008934 Number of tournament sequences: sequences <code>(a_1, a_2</code>, ..., <code>a_n)</code> with <code>a_1 = 1</code> such that <code>a_i &lt; a_{i+1} &lt;= 2*a_i</code> for all i.
 * @author Sean A. Irvine
 */
public class A008934 extends A093729 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, 1L);
  }
}
