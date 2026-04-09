package irvine.oeis.a084;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084383 a(0)=0; for n&gt;0, a(n) = smallest number that is not a concatenation of any number of distinct earlier terms in increasing order.
 * @author Sean A. Irvine
 */
public class A084383 extends Sequence0 {

  // After Michael S. Branicky

  private final ArrayList<String> mA = new ArrayList<>();
  private long mN = 0;

  private boolean is(final String s, final List<String> lst) {
    if (s.isEmpty()) {
      return true;
    }
    int pos = 0;
    for (final String t : lst) {
      if (t.length() > s.length()) {
        break;
      }
      ++pos;
      if (s.startsWith(t) && is(s.substring(t.length()), lst.subList(pos, lst.size()))) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add("0");
      return Z.ZERO;
    }
    while (true) {
      ++mN;
      final String s = String.valueOf(mN);
      if (!is(s, mA)) {
        mA.add(s);
        return Z.valueOf(mN);
      }
    }
  }
}
