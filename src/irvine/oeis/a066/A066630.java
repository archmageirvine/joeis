package irvine.oeis.a066;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A066630 Fibonacci numbers which are a nontrivial concatenation of Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A066630 extends Sequence1 {

  private final A000045 mFiboSeq = new A000045();
  private final List<String> mF = new ArrayList<>();

  private boolean is(final String f) {
    if (f.isEmpty()) {
      return true;
    }
    for (final String u : mF) {
      if (u.length() > f.length()) {
        return false;
      }
      if (f.startsWith(u) && is(f.substring(u.length()))) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final String f = mFiboSeq.next().toString();
      final boolean is = is(f);
      // Contortions to ensure 1 is only added once
      if (!"1".equals(f) || mF.size() == 1) {
        mF.add(f);
        if (is) {
          return new Z(f);
        }
      }
    }
  }
}
