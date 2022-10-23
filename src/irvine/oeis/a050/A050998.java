package irvine.oeis.a050;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050998 Inequivalent solutions to Langford (or Langford-Skolem) problem of arranging the numbers 1,1,2,2,3,3,...,n,n so that there is one number between the two 1's, two numbers between the two 2's, ..., n numbers between the two n's, listed by length and lexicographic order.
 * @author Sean A. Irvine
 */
public class A050998 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private int mStep = 1;
  private int mN = 0;

  private void search(final int[] vec, final int digit) {
    //System.out.println(digit + " " + Arrays.toString(vec));
    if (digit > mN) {
      Z resLeft = Z.ZERO;
      Z resRight = Z.ZERO;
      for (int k = 0; k < vec.length; ++k) {
        resLeft = resLeft.multiply(10).add(vec[k]);
        resRight = resRight.multiply(10).add(vec[vec.length - 1 - k]);
      }
      if (resLeft.compareTo(resRight) <= 0) {
        mA.add(resLeft);
      }
      return;
    }
    // Try adding digit at all possible places
    for (int pos0 = 0, pos1 = digit + 1; pos1 < vec.length; ++pos0, ++pos1) {
      if (vec[pos0] == 0 && vec[pos1] == 0) {
        vec[pos0] = digit;
        vec[pos1] = digit;
        search(vec, digit + 1);
        vec[pos1] = 0;
        vec[pos0] = 0;
      }
    }
  }

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      mStep = 4 - mStep;
      mN += mStep;
      if (mN >= 10) {
        // The following is only a representation issue, the search would still work fine
        throw new UnsupportedOperationException();
      }
      final int[] vec = new int[2 * mN];
      search(vec, 1);
    }
    return mA.pollFirst();
  }
}
