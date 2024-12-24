package irvine.oeis.a199;

import irvine.oeis.FilterSequence;
import irvine.oeis.a034.A034050;

/**
 * A199982 Composite numbers with digital product = 3.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A199982 extends FilterSequence {

  /** Construct the sequence. */
  public A199982() {
    super(1, new A034050(), c -> !c.isProbablePrime());
  }
}
