package irvine.oeis.a288;
// Generated by gen_seq4.pl 2024-04-11/tuptraf at 2024-04-11 21:12

import irvine.oeis.a002.A002487;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A288003 R-fusc, sequence r of the mutual diatomic recurrence pair: l(1)=0, r(1)=1, l(2n) = l(n), r(2n) = r(n), l(2n+1) = l(n)+r(n), r(2n+1) = l(n+1)+r(n+1), where l(n) = A288002(n).
 * @author Georg Fischer
 */
public class A288003 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A288003() {
    super(1, (n, s) -> s[0].subtract(s[1]), "", new A002487().skip(1), new A288002());
  }
}
