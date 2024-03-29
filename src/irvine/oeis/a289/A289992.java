package irvine.oeis.a289;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A289992 Number of magic labelings of the prism graph I X C_8 having magic sum n.
 * @author Georg Fischer
 */
public class A289992 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A289992() {
    super(0, new long[] {1, 39, 301, 747, 747, 301, 39, 1},
      new long[] {1, -10, 45, -120, 210, -252, 210, -120, 45, -10, 1});
  }
}
