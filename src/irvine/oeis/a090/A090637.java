package irvine.oeis.a090;
// Generated by gen_seq4.pl 2023-11-28/tuptraf at 2023-11-29 22:39

import irvine.oeis.a003.A003415;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A090637 Trajectory of 28 under the map k -&gt; A003415(k) (taking the arithmetic derivative).
 * @author Georg Fischer
 */
public class A090637 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A090637() {
    super(1, (n, s) -> new A003415().a(s[0]), "28", PREVIOUS);
  }
}
