package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.transform.GilbreathTransformSequence;

/**
 * A080816.
 * @author Sean A. Irvine
 */
public class A080839 extends Sequence1 {

  // Only good for a few terms

  private int mN = 0;

  private boolean is(final long[] seq) {
    final GilbreathTransformSequence g = new GilbreathTransformSequence(0, new FiniteSequence(seq));
    while (true) {
      final Z t = g.next();
      if (t == null) {
        return true;
      }
      if (!t.isOne()) {
        return false;
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    final long[] seq = new long[mN];
    seq[0] = 1;
    for (int k = 1; k < seq.length; ++k) {
      seq[k] = 2L * k;
    }
    long cnt = 0;
    while (seq[0] == 1) {
      if (is(seq)) {
        ++cnt;
      }
      for (int k = seq.length - 1; k >= 0; --k) {
        if (++seq[k] <= 1L << k) {
          for (int j = k + 1; j < seq.length; ++j) {
            seq[j] = seq[j - 1] + 1;
          }
          break;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}

