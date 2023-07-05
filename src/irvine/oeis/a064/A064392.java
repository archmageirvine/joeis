package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FilterSequence;

/**
 * A064392 Numbers in A064383 that are squarefree.
 * @author Sean A. Irvine
 */
public class A064392 extends FilterSequence {

  /** Construct the sequence. */
  public A064392() {
    super(new A064383(), k -> Jaguar.factor(k).isSquareFree());
  }
}

