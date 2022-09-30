package irvine.oeis.a059;

import irvine.math.cr.CR;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Integers;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059586 Number of labeled T_0-hypergraphs with n hyperedges (empty hyperedges and multiple hyperedges included).
 * @author Sean A. Irvine
 */
public class A059586 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> Stirling.firstKind(mN, k).abs().multiply(CR.E.multiply(MemoryFactorial.SINGLETON.factorial(Z.ONE.shiftLeft(k))).floor())).divide(MemoryFactorial.SINGLETON.factorial(mN));
  }
}
