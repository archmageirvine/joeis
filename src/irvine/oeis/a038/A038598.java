package irvine.oeis.a038;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a181.A181123;

/**
 * A038598 First differences between numbers that are a difference between 2 positive cubes.
 * @author Sean A. Irvine
 */
public class A038598 extends DifferenceSequence {

  /** Construct the sequence. */
  public A038598() {
    super(1, new A181123());
  }
}
