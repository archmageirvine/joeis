package irvine.oeis.a261;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A261955 Start with a single equilateral triangle for n=0; for the odd n-th generation add a triangle at each expandable side of the triangles of the (n-1)-th generation (this is the "side to side" version); for the even n-th generation use the "vertex to side" version; a(n) is the number of triangles added in the n-th generation.
 * @author Georg Fischer
 */
public class A261955 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A261955() {
    super(0, new long[] {1, 3, 5, 12, 6, 9, 3, 9, 5, 9, 13, 15, -9, -3},
      new long[] {1, 0, -1, 0, 0, 0, 0, 0, -1, 0, 1});
  }
}
