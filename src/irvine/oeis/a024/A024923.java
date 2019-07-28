package irvine.oeis.a024;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a000.A000961;

/**
 * A024923 Partial products of the sequence of prime powers <code>(A000961)</code>.
 * @author Sean A. Irvine
 */
public class A024923 extends PartialProductSequence {

  /** Construct the sequence. */
  public A024923() {
    super(new A000961());
  }
}
