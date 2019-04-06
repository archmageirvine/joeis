package irvine.oeis.a071;

import irvine.oeis.FiniteSequence;

/**
 * A071712 The 23-step cycle reached for any initial value k less than 100000, after iterations of sopf(8x+1), where sopf(n) denote the sum of the prime factors of n (sopf(12) = 2+2+3 = 7).
 * @author Georg Fischer
 */
public class A071712 extends FiniteSequence {

  /** Construct the sequence. */
  public A071712() {
    super(66, 46, 47, 42, 337, 63, 106, 286, 119, 953, 76, 39, 313, 175, 470, 3761, 30089, 367, 103, 24, 193, 111, 134);
  }
}
