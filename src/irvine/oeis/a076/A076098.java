package irvine.oeis.a076;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A076098 Geometric mean of n-th row in A076099.
 * @author Sean A. Irvine
 */
public class A076098 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A076098() {
    super(new A076097(), (n, k) -> k.root(n));
  }
}
