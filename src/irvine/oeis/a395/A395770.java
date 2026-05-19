package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395770 Minimal value of Sum_{i=1..n-1} p(i)*p(i+1), as p ranges over all permutations of powers of 2 {1,2,4,...,2^(n-1)}.
 * @author Sean A. Irvine
 */
public class A395770 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(10 * ++mN - 5 + ((mN & 1) == 1 ? -1 : 1)).shiftLeft(mN - 5);
  }
}
