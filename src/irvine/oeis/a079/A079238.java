package irvine.oeis.a079;

import java.util.Comparator;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079238 Numbers n in which the last K digits of n form an integer divisible by K^2, for K = 1, 2, ..., M, where M is the number of digits in n.
 * @author Sean A. Irvine
 */
public class A079238 extends Sequence1 {

  private final TreeSet<String> mA = new TreeSet<>(Comparator.comparingInt(String::length).thenComparing(s -> s));

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add("");
    }
    while (true) {
      final String s = mA.pollFirst();
      for (int d = 0; d < 10; ++d) {
        final String t = d + s;
        final long k = t.length();
        final Z v = new Z(t);
        if (v.mod(k * k) == 0) {
          mA.add(t);
        }
      }
      if (s.length() > 0 && s.charAt(0) > '0') {
        return new Z(s);
      }
    }
  }
}
