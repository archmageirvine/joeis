package irvine.oeis.a069;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a068.A068976;

/**
 * A069265 Numbers k such that Sum_{d|k} d/core(d) &gt; k, where core(d) is the squarefree part of d.
 * @author Sean A. Irvine
 */
public class A069265 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A069265() {
    super(1, 1, new A068976(), (k, v) -> v.compareTo(k) > 0);
  }
}
