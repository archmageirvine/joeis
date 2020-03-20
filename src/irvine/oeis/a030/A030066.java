package irvine.oeis.a030;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030066 Speak the numbers pausing after every component.
 * @author Sean A. Irvine
 */
public class A030066 implements Sequence {

  // This is a pretty dumb sequence

  private long mN = -1;
  private List<Z> mA = Collections.emptyList();
  private int mM = 0;

  private List<Z> decompose(final long n) {
    final ArrayList<Z> res = new ArrayList<>();
    if (n <= 20) {
      res.add(Z.valueOf(n));
      return res;
    }
    res.add(Z.valueOf(10 * (n / 10)));
    if (n % 10 != 0) {
      res.add(Z.valueOf(n % 10));
    }
    return res;
  }

  @Override
  public Z next() {
    if (++mM >= mA.size()) {
      if (++mN == 100) {
        // Unclear how 100 should be written in this sequence (100 vs 1, 100)
        throw new UnsupportedOperationException();
      }
      mA = decompose(mN);
      mM = 0;
    }
    return mA.get(mM);
  }
}
