package irvine.oeis.a067;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;
import irvine.util.string.StringUtils;

/**
 * A067517 Fibonacci numbers which can be partitioned into group of digits which are Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A067517 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Sequence mFibo = new A000045();
  private final ArrayList<String> mF = new ArrayList<>();
  private long mVerboseCount = 0;

  private boolean is(final String s) {
    if (s.isEmpty()) {
      return true;
    }
    for (final String f : mF) {
      if (f.length() > s.length()) {
        return false;
      }
      if (s.startsWith(f) && is(s.substring(f.length()))) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z f = mFibo.next();
      final String s = f.toString();
      final boolean is = is(s);
      mF.add(s);
      if (s.length() == 1 || is) {
        return f;
      }
      if (mVerbose && ++mVerboseCount % 1000 == 0) {
        StringUtils.message("Search completed to " + s.length() + " digits");
      }
    }
  }
}

