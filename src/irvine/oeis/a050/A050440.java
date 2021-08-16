package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a002.A002808;

/**
 * A050440 Sixth-order composites.
 * @author Sean A. Irvine
 */
public class A050440 extends NestedSequence {

  /** Construct the sequence. */
  public A050440() {
    super(1, new A002808(), new A050439(), 1, 1);
  }
}
