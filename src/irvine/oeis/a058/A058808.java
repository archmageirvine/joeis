package irvine.oeis.a058;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058808 Product{k=1 to n}[S(n,k)], where S(n,k) is a Stirling number of the second kind. (S(n,k) = number of ways of partitioning a set of n elements into k nonempty subsets.).
 * @author Sean A. Irvine
 */
public class A058808 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.product(1, ++mN, k -> Functions.STIRLING2.z(mN, (long) k));
  }
}
