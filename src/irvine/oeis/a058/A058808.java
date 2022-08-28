package irvine.oeis.a058;

import irvine.math.z.Integers;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058808 Product{k=1 to n}[S(n,k)], where S(n,k) is a Stirling number of the second kind. (S(n,k) = number of ways of partitioning a set of n elements into k nonempty subsets.).
 * @author Sean A. Irvine
 */
public class A058808 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.product(1, ++mN, k -> Stirling.secondKind(mN, k));
  }
}
