package irvine.oeis.a032;

import java.util.Comparator;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032890 Numbers n such that base 2 representation <code>Sum{d(i)*2^i: i=0,1,...,m</code> has <code>d(0)&gt;=d(1)&lt;=d(2)&gt;=..</code>.
 * @author Sean A. Irvine
 */
public class A032890 implements Sequence {

  private final TreeSet<String> mA = new TreeSet<>(Comparator.comparingInt(String::length).thenComparing(a -> new Z(a, base())));

  {
    for (long k = start(); k < base(); ++k) {
      mA.add(Z.valueOf(k).toString());
    }
  }

  protected int initialDirection() {
    return 0;
  }

  protected int base() {
    return 2;
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
        for (long k = first; k < base(); ++k) {
          mA.add(k + res);
        }
      } else {
        for (long k = 0; k <= first; ++k) {
          mA.add(k + res);
        }
      }
      if (res.charAt(0) != '0') {
        return new Z(res, base());
      }
    }
  }
}
