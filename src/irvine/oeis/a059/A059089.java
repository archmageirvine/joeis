package irvine.oeis.a059;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059089 Number of labeled T_0-hypergraphs with n distinct hyperedges (empty hyperedge excluded).
 * @author Sean A. Irvine
 */
public class A059089 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN + 1,
        k -> {
          return Functions.STIRLING1.z(mN + 1, (long) k).multiply(CR.E.multiply(Functions.FACTORIAL.z(1 << (k - 1))).floor());
        })
      .divide(Functions.FACTORIAL.z(mN));
  }
}
