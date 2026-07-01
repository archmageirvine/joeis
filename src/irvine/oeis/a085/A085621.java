package irvine.oeis.a085;

import irvine.oeis.ComplementSequence;
import irvine.oeis.a049.A049066;

/**
 * A085621 Mean prime gaps that do not occur in A049036.
 * @author Sean A. Irvine
 */
public class A085621 extends ComplementSequence {

  /** Construct the sequence. */
  public A085621() {
    super(1, new A049066());
  }
}
