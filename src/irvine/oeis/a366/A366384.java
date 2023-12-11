package irvine.oeis.a366;

import irvine.oeis.a355.A355828;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A366384 Lexicographically earliest infinite sequence such that a(i) = a(j) =&gt; A355828(i) = A355828(j) for all i, j &gt;= 1, where A355828 is Dirichlet inverse of A342671, the greatest common divisor of sigma(n) and A003961(n).
 * @author Georg Fischer
 */
public class A366384 extends RestrictedGrowthTransformSequence {

  /** Construct the sequence. */
  public A366384() {
    super(1, new A355828());
  }
}
