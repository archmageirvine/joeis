package irvine.oeis.a201;

import irvine.oeis.FilterSequence;
import irvine.oeis.a199.A199986;

/**
 * A201015 Composite numbers whose product of digits is 2.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A201015 extends FilterSequence {

  /** Construct the sequence. */
  public A201015() {
    super(1, new A199986(), c -> !c.isProbablePrime());
  }
}
