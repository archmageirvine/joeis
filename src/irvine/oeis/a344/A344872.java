package irvine.oeis.a344;
// Generated by gen_seq4.pl 2024-12-09.ack/filter at 2024-12-09 23:32

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A344872 Semiprimes of the form 3m+2.
 * @author Georg Fischer
 */
public class A344872 extends FilterSequence {

  /** Construct the sequence. */
  public A344872() {
    super(1, new LambdaSequence(1, k -> Z.THREE.multiply(k).add(2)), v -> Predicates.SEMIPRIME.is(v));
  }
}
