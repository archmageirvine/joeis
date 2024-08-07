package irvine.oeis.a348;
// Generated by gen_seq4.pl 2024-07-15/lambdan at 2024-07-15 19:12

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a005.A005940;
import irvine.oeis.a322.A322993;

/**
 * A348717 a(n) is the least k such that A003961^i(k) = n for some i &gt;= 0 (where A003961^i denotes the i-th iterate of A003961).
 * @author Georg Fischer
 */
public class A348717 extends LambdaSequence {

  private static final DirectSequence A005940 = new A005940();
  private static final DirectSequence A322993 = new A322993();

  /** Construct the sequence. */
  public A348717() {
    super(1, n -> A005940.a(A322993.a(n).add(1)));
  }
}
