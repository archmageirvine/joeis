package irvine.oeis.a155;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A155881 a(n) is the number of zeros needed to write the integers 1 through Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A155881 extends A000045 {

  {
    setOffset(1);
  }

  /** Construct the sequence. */
  public A155881() {
    super.next();
  }

  private Z zeros(final int power) {
    final Z p = Z.TEN.pow(power);
    return p.multiply(power - 1).subtract(p.divide(10).multiply(power)).add(1).divide(9);
  }

  private int zeros(final String s) {
    int c = 0;
    for (int k = 0; k < s.length(); ++k) {
      if (s.charAt(k) == '0') {
        ++c;
      }
    }
    return c;
  }

  private Z zeroCount(final Z n) {
    if (n.compareTo(Z.valueOf(100)) < 0) {
      return n.divide(10);
    }

    // find largest power of 10 less than n
    Z p = Z.ONE;
    int power = 0;
    Z t;
    while ((t = p.multiply(10)).compareTo(n) < 0) {
      p = t;
      ++power;
    }
    Z z = zeros(power);
    while (!p.equals(n)) {
      z = z.add(zeros(p.toString()));
      p = p.add(1);
    }
    return z.add(zeros(p.toString()));
  }

  @Override
  public Z next() {
    return zeroCount(super.next());
  }
}

