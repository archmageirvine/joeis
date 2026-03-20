package irvine.oeis.a393;

import irvine.oeis.a332.A332785;

/**
 * A393946 Numbers that are neither squarefree nor squareful, with prime power factor exponents that are pairwise coprime.
 * @author Sean A. Irvine
 */
public class A393946 extends A393999 {

  /** Construct the sequence. */
  public A393946() {
    super(new A332785());
  }
}
