package irvine.oeis.a059;

import irvine.math.z.Integers;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059085 Number of labeled n-node T_0-hypergraphs without multiple hyperedges (empty hyperedge included).
 * @author Sean A. Irvine
 */
public class A059085 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> Stirling.firstKind(mN, k).shiftLeft(1L << k));
  }
}
