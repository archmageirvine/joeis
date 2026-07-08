package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A085754 Numbers n such that (digital sum of n)^3 = reversal of n. (Powers of 10 excluded.).
 * @author Sean A. Irvine
 */
public class A085754 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A085754() {
    super(1, 215, k -> {
      final long r = Functions.REVERSE.l(k);
      return r > 1 && Functions.DIGIT_SUM.z(k).pow(3).equals(r);
    });
  }
}
