package irvine.oeis.a069;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a068.A068976;

/**
 * A069266 Numbers k such that Sum_{d|k} d/core(d) &gt; 2*k, where core(d) is the squarefree part of d.
 * @author Sean A. Irvine
 */
public class A069266 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A069266() {
    super(1, 1, new A068976(), (k, v) -> v.compareTo(2L * k) > 0);
  }
}
