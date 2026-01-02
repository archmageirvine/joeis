package irvine.oeis.a382;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a038.A038772;

/**
 * A382239 Numbers not divisible by any of their digits nor by the sum of their digits.  Digit 0 is allowed (and does not divide anything).
 * @author Sean A. Irvine
 */
public class A382239 extends FilterSequence {

  /** Construct the sequence. */
  public A382239() {
    super(1, new A038772(), k -> k.mod(Functions.DIGIT_SUM.l(k)) != 0);
  }
}
