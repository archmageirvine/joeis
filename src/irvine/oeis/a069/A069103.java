package irvine.oeis.a069;

import irvine.factor.prime.Puma;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A069103 a(1) = 1; a(2) = 1; a(n) = prime(a(n-1)) + prime(a(n-2)) if n &gt; 2.
 * @author Sean A. Irvine
 */
public class A069103 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A069103() {
    super(1, (n, s) -> Puma.primeZ(s[0]).add(Puma.primeZ(s[1])), "1, 1", PREVIOUS, PREVIOUS);
  }
}
