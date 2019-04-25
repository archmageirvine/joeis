package irvine.oeis.a023;

import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000396;
import irvine.oeis.a005.A005101;

/**
 * A023196 Nondeficient numbers: numbers n such that <code>sigma(n) &gt;= 2n</code>; union of A000396 and A005101.
 * @author Sean A. Irvine
 */
public class A023196 extends UnionSequence {

  /** Construct the sequence. */
  public A023196() {
    super(new A000396(), new A005101());
  }
}

