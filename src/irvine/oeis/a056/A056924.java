package irvine.oeis.a056;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000005;
import irvine.oeis.a038.A038548;

/**
 * A056924 Number of divisors of n that are smaller than sqrt(n).
 * @author Georg Fischer
 */
public class A056924 extends Combiner {

  /** Construct the sequence. */
  public A056924() {
    super(new A000005(), new A038548(), SUBTRACT);
  }
}
