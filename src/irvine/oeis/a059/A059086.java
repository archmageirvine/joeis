package irvine.oeis.a059;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059086 Number of labeled T_0-hypergraphs with n distinct hyperedges (empty hyperedge included).
 * @author Sean A. Irvine
 */
public class A059086 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN,
        k -> {
          return Stirling.firstKind(mN, k).multiply(CR.E.multiply(Functions.FACTORIAL.z(1 << k)).floor());
        })
      .divide(Functions.FACTORIAL.z(mN));
  }
}
