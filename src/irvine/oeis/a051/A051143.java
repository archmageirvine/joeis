package irvine.oeis.a051;

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000720;
import irvine.oeis.a049.A049575;

/**
 * A051142.
 * @author Sean A. Irvine
 */
public class A051143 extends NestedSequence {

  /** Construct the sequence. */
  public A051143() {
    super(1, new A000720(), new A049575(), 1, 1);
  }
}
