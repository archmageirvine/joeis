package irvine.oeis.a390;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FilterSequence;
import irvine.oeis.a386.A386762;

/**
 * A390381 Powers k^m, m &gt; 3, with k neither squarefree nor squareful.
 * @author Sean A. Irvine
 */
public class A390381 extends FilterSequence {

  /** Construct the sequence. */
  public A390381() {
    super(new A386762(), k -> Jaguar.factor(k).minExponent() >= 4);
  }
}
