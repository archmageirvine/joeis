package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000045;

/**
 * A075735 Squarefree Fibonacci numbers with an even number of prime factors (mu(n)=1).
 * @author Sean A. Irvine
 */
public class A075735 extends FilterSequence {

  /** Construct the sequence. */
  public A075735() {
    super(1, new A000045(), k -> Functions.MOBIUS.i(k) == 1);
  }
}
