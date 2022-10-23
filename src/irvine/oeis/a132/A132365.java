package irvine.oeis.a132;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000032;

/**
 * A132365 Least number k such that the Lucas number A000032(k) contains n.
 * @author Sean A. Irvine
 */
public class A132365 extends Sequence1 {

  private long mN = 0;
  private final ArrayList<String> mLucas = new ArrayList<>();
  private final A000032 mLucasSeq = new A000032();

  private String lucas(final int n) {
    while (n >= mLucas.size()) {
      mLucas.add(mLucasSeq.next().toString());
    }
    return mLucas.get(n);
  }

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    int k = 0;
    while (true) {
      if (lucas(k).contains(s)) {
        return Z.valueOf(k);
      }
      ++k;
    }
  }
}

