package irvine.oeis.a033;

import java.util.Comparator;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033015 Numbers whose base-2 expansion has no run of digits with length &lt; 2.
 * @author Sean A. Irvine
 */
public class A033015 extends Sequence1 {

  private static final char[] DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
  private final TreeSet<String> mA = new TreeSet<>(Comparator.comparingInt(String::length).thenComparing(a -> new Z(a, base())));

  {
    for (int k = 1; k < base(); ++k) {
      mA.add(String.valueOf(DIGITS[k]) + DIGITS[k]);
    }
  }

  protected int base() {
    return 2;
  }

  @Override
  public Z next() {
    while (true) {
      final String res = mA.pollFirst();
      final char last = res.charAt(res.length() - 1);
      for (int k = 0; k < base(); ++k) {
        if (DIGITS[k] != last) {
          mA.add(res + DIGITS[k] + DIGITS[k]);
        }
      }
      mA.add(res + last);
      return new Z(res, base());
    }
  }
}
