package irvine.oeis.a072;

import irvine.oeis.FilterPositionSequence;

/**
 * A072618 Numbers n for which the prime circle problem has a simple solution: the arrangement of numbers 1 through 2n around a circle is such that the sum of each pair of adjacent numbers is prime and the odd and even numbers are in order in opposite directions.
 * @author Sean A. Irvine
 */
public class A072618 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A072618() {
    super(1, new A072617(), NONZERO);
  }
}
