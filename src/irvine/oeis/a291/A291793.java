package irvine.oeis.a291;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A291793 Period of orbit of Post's tag system applied to the word (100)^n (version 2), or -1 if the orbit increases without limit.
 * @author Sean A. Irvine
 */
public class A291793 implements Sequence {

  private static final boolean[] EMPTY = new boolean[0];
  private int mN = 0;

  private boolean[] post(final boolean[] seq) {
    if (seq.length < 3) {
      return EMPTY;
    }
    if (!seq[0]) {
      final boolean[] res = new boolean[seq.length - 1];
      System.arraycopy(seq, 3, res, 0, seq.length - 3);
      return res;
    } else {
      final boolean[] res = new boolean[seq.length + 1];
      System.arraycopy(seq, 3, res, 0, seq.length - 3);
      res[res.length - 1] = true;
      res[res.length - 3] = true;
      res[res.length - 4] = true;
      return res;
    }
  }

  @Override
  public Z next() {
    ++mN;
    boolean[] a = new boolean[3 * mN];
    for (int k = 0; k < a.length; k += 3) {
      a[k] = true;
    }
    boolean[] b = Arrays.copyOf(a, a.length);
    do {
      a = post(a);
      b = post(post(b));
      if (b.length == 0) {
        return Z.ZERO;
      }
    } while (!Arrays.equals(a, b));
    int cnt = 0;
    do {
      ++cnt;
      a = post(a);
    } while (!Arrays.equals(a, b));
    return Z.valueOf(cnt);
  }
}

