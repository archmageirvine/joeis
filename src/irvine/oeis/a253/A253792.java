package irvine.oeis.a253;
// Generated by gen_seq4.pl 2024-05-24/dirtraf at 2024-05-24 21:50

import irvine.oeis.a156.A156552;
import irvine.oeis.a244.A244154;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A253792 Permutation of natural numbers: a(n) = A156552(A244154(n)).
 * @author Georg Fischer
 */
public class A253792 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A253792() {
    super(0, new A156552(), new A244154());
  }
}
