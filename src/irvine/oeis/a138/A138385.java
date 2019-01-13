package irvine.oeis.a138;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A138385.
 * @author Sean A. Irvine
 */
public class A138385 extends A000045 {

  private final HashSet<String> mS = new HashSet<>();

  @Override
  public Z next() {
    final String s = super.next().toString();
    int c = 0;
    for (final String v : mS) {
      if (s.contains(v)) {
        ++c;
      }
    }
    mS.add(s);
    return "1".equals(s) ? Z.ZERO : Z.valueOf(c);
  }
}
