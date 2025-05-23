package irvine.oeis.a382;
// Generated by gen_seq4.pl 2025-05-07.ack/filter at 2025-05-07 22:15

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a003.A003215;

/**
 * A382628 Centered hexagonal numbers that are sphenic numbers.
 * @author Georg Fischer
 */
public class A382628 extends FilterSequence {

  /** Construct the sequence. */
  public A382628() {
    super(1, new A003215(), v -> Functions.BIG_OMEGA.l(v) == 3 && Functions.OMEGA.l(v) == 3);
  }
}
