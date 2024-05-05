package irvine.oeis.a069;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069522.
 * @author Sean A. Irvine
 */
public class A069569 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.TWO;
    }
    // Number is already prime
    final String s = String.valueOf(mN);
    final Z a = new Z(s.repeat(mN));
    if (a.isProbablePrime()) {
      return a;
    }
    // Try inserting a single digit somewhere
    final TreeSet<Z> smallest = new TreeSet<>();
    for (int k = 0; k <= mN; ++k) { // position to insert extra digit
      for (int digit = k == 0 ? 1 : 0; digit < 10; ++digit) {
        if (digit != mN) {
          final Z t = new Z(s.repeat(k) + digit + s.repeat(mN - k));
          if (t.isProbablePrime()) {
            smallest.add(t);
          }
        }
      }
    }
    if (smallest.isEmpty()) {
      // Try inserting two digits
      for (int k = 0; k <= mN; ++k) { // position to insert second extra digit
        for (int j = 0; j <= k; ++j) { // position to insert first extra digit
          for (int d1 = j == 0 ? 1 : 0; d1 < 10; ++d1) {
            if (d1 != mN) {
              for (int d2 = 0; d2 < 10; ++d2) {
                if (j != k || d1 * 10 + d2 != mN) {
                  final Z t = new Z(s.repeat(j) + d1 + s.repeat(k - j) + d2 + s.repeat(mN - k));
                  if (t.isProbablePrime()) {
                    smallest.add(t);
                  }
                }
              }
            }
          }
        }
      }
    }
    return smallest.pollFirst();
  }
}
