package irvine.oeis.a101;
// Generated by gen_seq4.pl tritoep

import irvine.oeis.recur.PaddingSequence;
import irvine.oeis.triangle.ToeplitzTriangle;

/**
 * A101038 Inverse to sequence matrix for odd numbers.
 * @author Georg Fischer
 */
public class A101038 extends ToeplitzTriangle {

  /** Construct the sequence. */
  public A101038() {
    super(0, new PaddingSequence("1,-3", "4,-4"));
  }
}

