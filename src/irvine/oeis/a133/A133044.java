package irvine.oeis.a133;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A133044 Area of the spiral of equilateral triangles with side lengths which follow the Padovan sequence, divided by the area of the initial triangle.
 * @author Georg Fischer
 */
public class A133044 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A133044() {
    super(1, new long[] {0, 1, 1, 0, 1},
      new long[] {1, -1, -1, -1, 1, -1, 1});
  }
}
