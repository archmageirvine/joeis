package irvine.oeis.a108;
// manually knestm/knest at 2023-03-02 16:06

import irvine.math.z.Z;
import irvine.oeis.a018.A018783;

/**
 * A108572 Number of partitions of n which, as multisets, are nontrivial repetitions of a multiset.
 * @author Georg Fischer
 */
public class A108572 extends A018783 {

  private int mN = 0;

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z t = super.next().subtract(1);
    return (++mN == 1) ? Z.ZERO : t;
  }
}
