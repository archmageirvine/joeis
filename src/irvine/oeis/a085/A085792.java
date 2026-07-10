package irvine.oeis.a085;

import irvine.oeis.a000.A000007;
import irvine.oeis.a000.A000108;
import irvine.oeis.transform.DelehamDeltaSequence;

/**
 * A085768.
 * @author Sean A. Irvine
 */
public class A085792 extends DelehamDeltaSequence {

  /** Construct the sequence. */
  public A085792() {
    super(new A000007(), new A000108());
  }
}
