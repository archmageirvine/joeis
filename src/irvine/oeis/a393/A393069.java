package irvine.oeis.a393;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A393069 Numbers whose prime divisors all start with the same digit.
 * @author Sean A. Irvine
 */
public class A393069 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A393069() {
    super(1, k -> {
      final Z[] p = Jaguar.factor(k).toZArray();
      if (p.length <= 1) {
        return true;
      }
      final char c = p[0].toString().charAt(0);
      for (int j = 1; j < p.length; ++j) {
        if (p[j].toString().charAt(0) != c) {
          return false;
        }
      }
      return true;
    });
  }
}
