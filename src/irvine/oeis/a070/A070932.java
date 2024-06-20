package irvine.oeis.a070;

import irvine.oeis.PrependSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a002.A002202;
import irvine.oeis.a181.A181062;
import irvine.oeis.closure.MultiplicativeClosureSequence;

/**
 * A070932 Possible number of units in a finite (commutative or non-commutative) ring.
 * @author Sean A. Irvine
 */
public class A070932 extends PrependSequence {

  /** Construct the sequence. */
  public A070932() {
    super(new MultiplicativeClosureSequence(new UnionSequence(new A002202().skip(2), new A181062().skip(2))), 0);
  }
}
