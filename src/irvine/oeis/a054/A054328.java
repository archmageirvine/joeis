package irvine.oeis.a054;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A054328 Tenth unsigned column of Lanczos triangle A053125 (decreasing powers).
 * @author Georg Fischer
 */
public class A054328 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A054328() {
    super(0, new long[] {10, 480, 4032, 7680, 2560},
      new long[] {1, -40, 720, -7680, 53760, -258048, 860160, -1966080, 2949120, -2621440, 
      1048576});
  }
}
