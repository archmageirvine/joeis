package irvine.oeis.a243;

import java.util.Set;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A243846 Numbers for which the nozero power-sequence of n falls into a loop.
 * @author Sean A. Irvine
 */
public class A243846 implements Sequence {

  private Z mN = Z.ZERO;
  private final Set<Z> mSeen = new TreeSet<>();

  private Z noZero(final Z n) {
    final String m = n.toString();
    if (!m.contains("0")) {
      return n;
    }
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < m.length(); ++k) {
      final char c = m.charAt(k);
      if (c != '0') {
        sb.append(c);
      }
    }
    return new Z(sb);
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    mSeen.clear();
    Z x = Z.ONE;
    while (mSeen.add(x)) {
      x = noZero(x.multiply(mN));
    }
    return x;
  }
}
