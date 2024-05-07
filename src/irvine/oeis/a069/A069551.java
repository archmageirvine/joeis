package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a062.A062799;

/**
 * A069551 Numbers k such that the squarefree part of k equals A062799(k).
 * @author Sean A. Irvine
 */
public class A069551 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A069551() {
    super(1, 1, new A062799(), (n, k) -> k.equals(Functions.CORE.z(n)));
  }
}
