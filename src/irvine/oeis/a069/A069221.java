package irvine.oeis.a069;
// Generated by gen_seq4.pl 2023-11-13/tuptraf at 2023-11-17 15:02

import irvine.math.z.Z;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A069221 a(1) = a(2) = 1; a(n) = &lt;&gt;(a(n-1)) + &lt;&gt;(a(n-2)) for n &gt; 2, where &lt;&gt;(k) denotes the concatenation of k with itself.
 * @author Georg Fischer
 */
public class A069221 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A069221() {
    super(1, (n, s) -> new Z(s[0].toString() + s[0].toString()).add(new Z(s[1].toString() + s[1].toString())), "1,1", PREVIOUS, PREVIOUS);
  }
}
