package irvine.oeis.a038;

import irvine.oeis.ComplementSequence;
import irvine.oeis.a181.A181123;

/**
 * A038673 Numbers that are not the difference between two positive cubes.
 * @author Sean A. Irvine
 */
public class A038673 extends ComplementSequence {

  /** Construct the sequence. */
  public A038673() {
    super(new A181123());
  }
}
