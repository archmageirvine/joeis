package irvine.oeis.a028;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.a007.A007710;
import irvine.util.Permutation;

/**
 * A028305 Triangle of numbers of permutations eliminating just k cards out of n in game of Mousetrap.
 * @author Sean A. Irvine
 */
public class A028305 extends A007710 {

  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    long count = 0;
    final Permutation perm = new Permutation(mN);
    int[] p;
    while ((p = perm.next()) != null) {
      if (isDiscardCount(Arrays.copyOf(p, p.length), mM)) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }

}
