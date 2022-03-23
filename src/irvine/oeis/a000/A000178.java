package irvine.oeis.a000;

import irvine.oeis.PartialProductSequence;

/**
 * A000178 Superfactorials: product of first n factorials.
 * @author Sean A. Irvine
 */
public class A000178 extends PartialProductSequence {

  /** Construct the sequence. */
  public A000178() {
    super(new A000142());
  }
}
