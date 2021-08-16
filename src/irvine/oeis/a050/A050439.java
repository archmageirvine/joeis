package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a002.A002808;

/**
 * A050439 Fifth-order composites.
 * @author Sean A. Irvine
 */
public class A050439 extends NestedSequence {

  /** Construct the sequence. */
  public A050439() {
    super(1, new A002808(), new A050438(), 1, 1);
  }
}
