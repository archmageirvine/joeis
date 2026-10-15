package irvine.oeis.a074;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a001.A001597;

/**
 * A074321 Numbers k such that the k-th perfect power + k is prime: k + A001597(k) is prime.
 * @author Sean A. Irvine
 */
public class A074321 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A074321() {
    super(1, 1, new A001597(), (n, k) -> k.add(n).isProbablePrime());
  }
}
