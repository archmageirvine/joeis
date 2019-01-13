package irvine.oeis.a132;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000032;

import java.util.ArrayList;

/**
 * A132365.
 * @author Sean A. Irvine
 */
public class A132365 implements Sequence {

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

