package irvine.oeis.a169;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A169113 Number of reduced words of length n in Coxeter group on 4 generators S_i with relations (S_i)^2 = (S_i S_j)^26 = I.
 * @author Sean A. Irvine
 */
public class A169113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169113() {
    super(new long[] {-3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, new long[] {1, 4, 12, 36, 108, 324, 972, 2916, 8748, 26244, 78732, 236196, 708588, 2125764, 6377292, 19131876, 57395628, 172186884, 516560652, 1549681956, 4649045868L, 13947137604L, 41841412812L, 125524238436L, 376572715308L, 1129718145924L});
  }
}
