package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A080203 Steffi sequence; the numbers of pairs of unequal permutations of all the digits 1, ..., b-1 in base b whose ratio is an integer.
 * @author Sean A. Irvine
 */
public class A080203 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    return A080202.count(++mN, mN - 1);
  }
}

