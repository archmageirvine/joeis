package irvine.oeis.a060;

import irvine.oeis.PartialProductSequence;

/**
 * A060193 Partial products of A060191.
 * @author Sean A. Irvine
 */
public class A060193 extends PartialProductSequence {

  /** Construct the sequence. */
  public A060193() {
    super(new A060191());
  }
}
