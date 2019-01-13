package irvine.oeis.a103;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.HashMap;

/**
 * A103618.
 * @author Sean A. Irvine
 */
public class A103618 implements Sequence {

  private long mN = -1;

  private String describe(final String s) {
    final int[] c = new int[10];
    for (int k = 0; k < s.length(); ++k) {
      c[s.charAt(k) - '0']++;
    }
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < c.length; ++k) {
      if (c[k] != 0) {
        sb.append(c[k]).append(k);
      }
    }
    return sb.toString();
  }

  @Override
  public Z next() {
    String s = String.valueOf(++mN);
    int i = 0;
    final HashMap<String, Integer> mSeen = new HashMap<>();
    while (true) {
      mSeen.put(s, i++);
      s = describe(s);
      final Integer v = mSeen.get(s);
      if (v != null) {
        return Z.valueOf(v);
      }
    }
  }
}

