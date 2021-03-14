package irvine.oeis.a045;

import irvine.oeis.ComplementSequence;
import irvine.oeis.IntersectionSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a046.A046066;

/**
 * A045492.
 * @author Sean A. Irvine
 */
public class A045493 extends IntersectionSequence {

  /** Construct the sequence. */
  public A045493() {
    super(new ComplementSequence(new A046066()), new A000040());
  }
}
