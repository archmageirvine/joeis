package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167929 Number of reduced words of length n in Coxeter group on 19 generators S_i with relations (S_i)^2 = (S_i S_j)^16 = I.
 * @author Sean A. Irvine
 */
public class A167929 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167929() {
    super(new long[] {-153, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17}, new long[] {1, 19, 342, 6156, 110808, 1994544, 35901792, 646232256, 11632180608L, 209379250944L, 3768826516992L, 67838877305856L, 1221099791505408L, 21979796247097344L, 395636332447752192L, 7121453984059539456L});
  }
}
