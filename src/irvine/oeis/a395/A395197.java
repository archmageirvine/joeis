package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a372.A372404;

/**
 * A395197 Noncubefree powerful numbers divisible by more than 2 distinct primes.
 * @author Sean A. Irvine
 */
public class A395197 extends FilterSequence {

  /** Construct the sequence. */
  public A395197() {
    super(1, new A372404(), k -> Functions.OMEGA.i(k) > 2);
  }
}
