package irvine.oeis.a353;
// Generated by gen_seq4.pl rgs/rgs2 at 2023-10-24 18:46

import irvine.oeis.a000.A000035;
import irvine.oeis.a003.A003415;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A353522 Lexicographically earliest infinite sequence such that a(i) = a(j) =&gt; A000035(i) = A000035(j) and A003415(i) = A003415(j), for all i, j &gt;= 1, where A000035 and A003415 compute the parity and the arithmetic derivative of their argument.
 * @author Georg Fischer
 */
public class A353522 extends RestrictedGrowthTransformSequence {

  /** Construct the sequence. */
  public A353522() {
    super(1, new A000035().skip(1), new A003415().skip(1));
  }
}
