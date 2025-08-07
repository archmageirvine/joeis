package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A079320 CATS sequence: cube-add-then-sort variation of RATS (reverse, add then sort) sequence.
 * @author Sean A. Irvine
 */
public class A079320 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return Functions.DIGIT_SORT_ASCENDING.z(Z.valueOf(++mN).pow(3).add(mN));
  }
}
