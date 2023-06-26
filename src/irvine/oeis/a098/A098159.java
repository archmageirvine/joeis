package irvine.oeis.a098;

import irvine.oeis.FiniteSequence;

/**
 * A098159 Numbers n with property that when writing down all the nonnegative numbers from 0 to n one uses n odd digits.
 * @author Georg Fischer
 */
public class A098159 extends FiniteSequence {

  /** Construct the sequence. */
  public A098159() {
    super(1, FINITE, 1, 17, 18, 20, 21, 37, 38, 40, 41, 57, 58, 60, 61, 77, 78, 80, 81, 97, 98);
  }
}
