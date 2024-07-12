package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005117;

/**
 * A071312 Squarefree numbers k such that the largest prime factor of k is equal to the sum of the other prime factors of k.
 * @author Sean A. Irvine
 */
public class A071312 extends FilterSequence {

  /** Construct the sequence. */
  public A071312() {
    super(1, new A005117().skip(), k -> 2 * Functions.GPF.l(k) == Functions.SOPF.l(k));
  }
}
