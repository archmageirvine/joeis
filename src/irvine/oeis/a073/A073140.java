package irvine.oeis.a073;

import irvine.oeis.Combiner;

/**
 * A073140 Sum of the largest and smallest number having in binary representation the same number of 0's and 1's as n.
 * @author Sean A. Irvine
 */
public class A073140 extends Combiner {

  /** Construct the sequence. */
  public A073140() {
    super(0, new A073138(), new A073137(), ADD);
  }
}
