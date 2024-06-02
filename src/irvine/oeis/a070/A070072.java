package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070072 Number of distinct rectangles with integer sides &lt;= n and squarefree area.
 * @author Sean A. Irvine
 */
public class A070072 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN, k -> Integers.SINGLETON.sum(1, k, j -> Functions.MOBIUS.z(k * j).abs()));
  }
}
