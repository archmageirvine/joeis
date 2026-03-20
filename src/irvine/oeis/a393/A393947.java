package irvine.oeis.a393;

import irvine.oeis.a332.A332785;
import irvine.oeis.a394.A394000;

/**
 * A393947 Numbers that are neither squarefree nor squareful with prime power factor exponents that are not all pairwise coprime.
 * @author Sean A. Irvine
 */
public class A393947 extends A394000 {

  /** Construct the sequence. */
  public A393947() {
    super(new A332785());
  }
}
