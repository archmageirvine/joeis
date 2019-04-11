package irvine.oeis.a295;

import irvine.oeis.FiniteSequence;

/**
 * A295523 Nonprime numbers n such that A243822(n) <code>&gt;=</code> A243823(n).
 * @author Georg Fischer
 */
public class A295523 extends FiniteSequence {

  /** Construct the sequence. */
  public A295523() {
    super(1, 4, 6, 10, 12, 18, 30);
  }
}
