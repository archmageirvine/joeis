package irvine.oeis.a057;

import irvine.oeis.PartialProductSequence;

/**
 * A057528 5th level factorials: product of first n 4th level factorials.
 * @author Sean A. Irvine
 */
public class A057528 extends PartialProductSequence {

  /** Construct the sequence. */
  public A057528() {
    super(new A057527());
  }
}
