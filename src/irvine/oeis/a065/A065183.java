package irvine.oeis.a065;

import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065183 Permutation of nonnegative integers produced when the finite permutations listed by A060117 are subjected to the inverse of (variant of) Foata's transformation. Inverse of A065184.
 * @author Sean A. Irvine
 */
public class A065183 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final int r = ++mN;
    return new IntegerPermutation(A065181.foataInverse(IntegerPermutation.permUnrank3R(r).getPerm())).permRank3R();
  }
}
