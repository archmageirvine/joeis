package irvine.oeis.a085;

import irvine.oeis.FilterNumberSequence;

/**
 * A085446 Numbers divisible by twice the sum of the products of each of their digits, excluding even multiples of 10.
 * @author Sean A. Irvine
 */
public class A085446 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A085446() {
    super(0, 162, 2, n -> {
      if (n % 10 == 0) {
        return false;
      }
      final String s = String.valueOf(n);
      long sum = 0;
      for (int k = 0; k < s.length(); ++k) {
        for (int j = 0; j < s.length(); ++j) {
          sum += (long) (s.charAt(k) - '0') * (s.charAt(j) - '0');
        }
      }
      sum *= 2;
      return n % sum == 0;
    });
  }
}
