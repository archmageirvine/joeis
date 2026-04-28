package irvine.oeis.a395;

import irvine.oeis.FilterSequence;
import irvine.oeis.a048.A048375;

/**
 * A395338 allocated for Pang Ern.
 * @author Sean A. Irvine
 */
public class A395338 extends FilterSequence {

  /** Construct the sequence. */
  public A395338() {
    super(new A048375(), PRIME);
  }
}
