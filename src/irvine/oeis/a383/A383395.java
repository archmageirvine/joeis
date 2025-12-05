package irvine.oeis.a383;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a024.A024365;
import irvine.oeis.a050.A050936;

/**
 * A383395 allocated for Robert Israel.
 * @author Sean A. Irvine
 */
public class A383395 extends IntersectionSequence {

  /** Construct the sequence. */
  public A383395() {
    super(1, new A024365(), new A050936());
  }
}
