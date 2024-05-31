package irvine.oeis.a059;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059586 Number of labeled T_0-hypergraphs with n hyperedges (empty hyperedges and multiple hyperedges included).
 * @author Sean A. Irvine
 */
public class A059586 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> Functions.STIRLING1.z(mN, (long) k).abs().multiply(CR.E.multiply(Functions.FACTORIAL.z(Z.ONE.shiftLeft(k))).floor())).divide(Functions.FACTORIAL.z(mN));
  }
}
