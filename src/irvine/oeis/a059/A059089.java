package irvine.oeis.a059;

import irvine.math.cr.CR;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Integers;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059089 Number of labeled T_0-hypergraphs with n distinct hyperedges (empty hyperedge excluded).
 * @author Sean A. Irvine
 */
public class A059089 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN + 1,
        k -> Stirling.firstKind(mN + 1, k).multiply(CR.E.multiply(MemoryFactorial.SINGLETON.factorial(1 << (k - 1))).floor()))
      .divide(MemoryFactorial.SINGLETON.factorial(mN));
  }
}
