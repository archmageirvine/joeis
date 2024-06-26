package irvine.oeis.a076;
// Generated by gen_seq4.pl 2024-06-09/prepend at 2024-06-09 23:02

import irvine.oeis.PrependSequence;
import irvine.oeis.a092.A092874;

/**
 * A076187 Decimal expansion of Sum_{k&gt;=0} 1/2^(k!).
 * @author Georg Fischer
 */
public class A076187 extends PrependSequence {

  /** Construct the sequence. */
  public A076187() {
    super(1, new A092874().skip(1), 1, 2);
  }
}
