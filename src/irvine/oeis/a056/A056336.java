package irvine.oeis.a056;

import irvine.oeis.PrependSequence;

/**
 * A056336 Number of primitive (aperiodic) reversible string structures with n beads using exactly two different colors.
 * @author Sean A. Irvine
 */
public class A056336 extends PrependSequence {

  /** Construct the sequence. */
  public A056336() {
    super(1, new A056331().skip(1), 0);
  }
}
