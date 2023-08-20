package irvine.oeis.a060;

import irvine.math.set.IntegerPermutation;

/**
 * A060118 A list of all finite permutations in "PermUnrank3L" ordering. (Inverses of the permutations of A060117.).
 * @author Sean A. Irvine
 */
public class A060118 extends A060117 {

  @Override
  protected IntegerPermutation permUnrank3R(final int r) {
    return IntegerPermutation.permUnrank3R(r).inverse();
  }
}
