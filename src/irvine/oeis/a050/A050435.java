package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a002.A002808;

/**
 * A050435 a(n) = composite(composite(n)), where composite = A002808, composite numbers.
 * @author Sean A. Irvine
 */
public class A050435 extends NestedSequence {

  /** Construct the sequence. */
  public A050435() {
    super(1, new A002808(), new A002808(), 1, 1);
  }
}
