package irvine.oeis.a359;
// Generated by gen_seq4.pl 2023-10-27/tuptraf at 2023-10-28 00:14

import irvine.math.z.Binomial;
import irvine.oeis.a029.A029837;
import irvine.oeis.a029.A029931;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A359400 Sum of positions of zeros in the reversed binary expansion of n, where positions in a sequence are read starting with 1 from the left.
 * @author Georg Fischer
 */
public class A359400 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A359400() {
    super(0, (n, s) -> Binomial.binomial(s[0].add(1), 2).subtract(s[1]), "1", new A029837().skip(1), new A029931().skip(1));
  }
}
