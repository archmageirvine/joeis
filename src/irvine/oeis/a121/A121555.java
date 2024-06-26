package irvine.oeis.a121;
// Generated by gen_seq4.pl 2023-12-24/tuptraf at 2023-12-26 12:51

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A121555 Number of 1-cell columns in all deco polyominoes of height n.
 * @author Georg Fischer
 */
public class A121555 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A121555() {
    super(1, (n, s) -> s[0].multiply(n).add(Functions.FACTORIAL.z(n - 2).multiply(Z.valueOf(n - 2))), "1", PREVIOUS);
  }
}
