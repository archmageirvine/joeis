package irvine.oeis.a090;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A090822 Gijswijt's sequence: a(1) = 1; for n&gt;1, a(n) = largest integer k such that the word a(1)a(2)...a(n-1) is of the form xy^k for words x and y (where y has positive length), i.e., the maximal number of repeating blocks at the end of the sequence so far.
 * @author Sean A. Irvine
 */
public class A090822 extends Sequence1 {

  // After Robert Israel

  private final List<Integer> mA = new ArrayList<>();
  private int mN = 0;

  private int k(final List<Integer> lst) {
    int m = 0;
    final int n = lst.size();
    for (int k = 1; ; ++k) {
      if (k * (m + 1) > n) {
        return m;
      }

      // Extract suffix block b of length k
      boolean match;
      int i = 1;

      while (true) {
        if (i * k > n) {
          break;
        }
        // Compare block b with preceding block
        match = true;
        for (int j = 0; j < k; ++j) {
          final int idx1 = n - k + j;           // element in b
          final int idx2 = n - i * k + j;       // corresponding earlier block
          if (idx2 < 0 || !lst.get(idx1).equals(lst.get(idx2))) {
            match = false;
            break;
          }
        }
        if (!match) {
          break;
        }
        ++i;
      }
      m = Math.max(m, i - 1);
    }
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      mA.add(1);
      return Z.ONE;
    }
    final int val = k(mA);
    mA.add(val);
    return Z.valueOf(val);
  }
}
