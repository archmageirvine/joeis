package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052056 Numbers k such that k! starts with its largest prime substring.
 * @author Sean A. Irvine
 */
public class A052056 implements Sequence {

  private long mN = 0;
  private Z mF = Z.ONE;

  private Z initial(final String n) {
    for (int k = n.length(); k > 0; --k) {
      // Fast check for even digits
      if (k <= 1 || (n.charAt(k - 1) & 1) == 1) {
        final Z p = new Z(n.substring(0, k));
        if (p.isProbablePrime()) {
          return p;
        }
      }
    }
    return null;
  }

  private boolean test(final Z n) {
    final String m = n.toString();
    final Z p = initial(m);
    if (p == null) {
      return false;
    }
    final int minLen = p.toString().length();
    for (int k = 1; k + minLen < m.length(); ++k) {
      for (int j = k + minLen; j < m.length(); ++j) {
        final Z c = new Z(m.substring(k, j));
        if (c.isProbablePrime() && c.compareTo(p) > 0) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      // Can safely discard trailing 0's for sake of this sequence
      while (mF.mod(10) == 0) {
        mF = mF.divide(10);
      }
      if (test(mF)) {
        return Z.valueOf(mN);
      }
    }
  }
}

