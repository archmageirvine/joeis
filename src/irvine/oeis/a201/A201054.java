package irvine.oeis.a201;

import irvine.oeis.FilterSequence;
import irvine.oeis.a199.A199985;

/**
 * A201054 Composite numbers whose product of digits is 5.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A201054 extends FilterSequence {

  /** Construct the sequence. */
  public A201054() {
    super(1, new A199985(), c -> !c.isProbablePrime());
  }
}
