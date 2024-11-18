package irvine.oeis.a073;

import irvine.oeis.Combiner;

/**
 * A073139 Difference between the largest and smallest number having in binary representation the same number of 0's and 1's as n.
 * @author Sean A. Irvine
 */
public class A073139 extends Combiner {

  /** Construct the sequence. */
  public A073139() {
    super(0, new A073138(), new A073137(), SUBTRACT);
  }
}
