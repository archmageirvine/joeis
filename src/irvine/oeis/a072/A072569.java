package irvine.oeis.a072;

import irvine.oeis.FilterSequence;
import irvine.oeis.a024.A024675;

/**
 * A072569 Odd interprimes.
 * @author Sean A. Irvine
 */
public class A072569 extends FilterSequence {

  /** Construct the sequence. */
  public A072569() {
    super(1, new A024675(), ODD);
  }
}
