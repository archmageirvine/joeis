package irvine.oeis.a293;
// Generated by gen_seq4.pl 2024-05-13/multrad at 2024-05-13 22:33

import irvine.oeis.DirectSequence;
import irvine.oeis.a008.A008966;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A293428 a(0) = 1; and for n &gt; 0, a(n) = a(n-1) + (A008966(4n+1) - A107078(4n+3)).
 * @author Georg Fischer
 */
public class A293428 extends MultiTransformSequence {

  private static final DirectSequence SEQ = new A008966();

  /** Construct the sequence. */
  public A293428() {
    super(0, (self, n) -> self.a(n - 1).add(SEQ.a(4 * n + 3)).add(SEQ.a(4 * n + 1)).subtract(1), "1");
  }
}
