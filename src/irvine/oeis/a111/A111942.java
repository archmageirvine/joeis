package irvine.oeis.a111;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: (1-x/2)/sqrt(1-x^2/4)*arccos(1-x^2/2)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A111942 Column 0 of the matrix logarithm (A111941) of triangle A111940, which shifts columns left and up under matrix inverse; these terms are the result of multiplying the element in row n by n!.
 * @author Georg Fischer
 */
public class A111942 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A111942() {
    super(0, "[[0],[0,0,1],[-4,-8,-2],[8,-4,-4],[48,40,8]]", "[0,1,-1,1,-2]", 3);
    setGfType(1);
  }
}
