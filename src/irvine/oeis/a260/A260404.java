package irvine.oeis.a260;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a057.A057528;

/**
 * A260404 6th level factorials: product of first n 5th level factorials.
 * @author Sean A. Irvine
 */
public class A260404 extends PartialProductSequence {

  /** Construct the sequence. */
  public A260404() {
    super(new A057528());
  }
}
