package irvine.oeis.a099;

import irvine.oeis.FiniteSequence;

/**
 * A099651 For each of the C(10,2) = 45 pairs of decimal digits, record the smallest prime containing only these digits (if one exists); sort.
 * @author Georg Fischer
 */
public class A099651 extends FiniteSequence {

  /** Construct the sequence. */
  public A099651() {
    super(1, FINITE, 13, 17, 19, 23, 29, 37, 41, 43, 47, 53, 59, 61, 67, 79, 83, 89, 101, 151, 181, 211, 227, 449, 557, 787);
  }
}
