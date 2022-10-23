package irvine.oeis.a032;

import java.util.Comparator;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032874 Numbers whose base-3 representation Sum_{i=0..m} d(i)*3^i has d(0) &gt; d(1) &lt; d(2) &gt; ...
 * @author Sean A. Irvine
 */
public class A032874 extends Sequence1 {

  private final TreeSet<String> mA = new TreeSet<>(Comparator.comparing(val -> new Z(val, base())));

  {
    for (long k = start(); k < base(); ++k) {
      mA.add(Z.valueOf(k).toString());
    }
  }

  protected int initialDirection() {
    return 0;
  }

  protected int base() {
    return 3;
  }

  protected long start() {
    return 0;
  }

  @Override
  public Z next() {
    while (true) {
      final String res = mA.pollFirst();
      final long first = res.charAt(0) - '0';
      if ((res.length() & 1) == initialDirection()) {
        for (long k = first + 1; k < base(); ++k) {
          mA.add(k + res);
        }
      } else {
        for (long k = 0; k < first; ++k) {
          mA.add(k + res);
        }
      }
      if (res.charAt(0) != '0') {
        return new Z(res, base());
      }
    }
  }
}
