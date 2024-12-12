package irvine.oeis.a073;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a002.A002379;

/**
 * A073565.
 * @author Sean A. Irvine
 */
public class A073633 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A073633() {
    super(1, 1, new A002379().skip(), (n, k) -> k.mod(n) == 0);
  }
}
