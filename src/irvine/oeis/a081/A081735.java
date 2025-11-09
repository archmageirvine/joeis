package irvine.oeis.a081;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a001.A001006;

/**
 * A081735 Numbers k such that the k-th Motzkin number == 1 (mod k).
 * @author Sean A. Irvine
 */
public class A081735 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A081735() {
    super(1, 1, new A001006().skip(), (n, k) -> k.mod(n) == 1 % n);
  }
}
