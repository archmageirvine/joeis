package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a002.A002808;

/**
 * A050436 Third-order composites.
 * @author Sean A. Irvine
 */
public class A050436 extends NestedSequence {

  /** Construct the sequence. */
  public A050436() {
    super(1, new A002808(), new A050435(), 1, 1);
  }
}
