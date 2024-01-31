package irvine.oeis.a068;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A068144 Triangular numbers which are a concatenation of two or more positive triangular numbers.
 * @author Sean A. Irvine
 */
public class A068144 extends Sequence1 {

  private final Sequence mTriangular = new A000217().skip();
  private final List<String> mS = new ArrayList<>();

  private boolean is(final String t) {
    if (t.isEmpty()) {
      return true;
    }
    String s;
    for (int k = 0; k < mS.size() - 1 && (s = mS.get(k)).length() <= t.length(); ++k) {
      if (t.startsWith(s) && is(t.substring(s.length()))) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mTriangular.next();
      mS.add(t.toString());
      if (is(t.toString())) {
        return t;
      }
    }
  }
}
