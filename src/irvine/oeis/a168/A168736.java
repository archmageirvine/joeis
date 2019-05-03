package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168736 Number of reduced words of length n in Coxeter group on 11 generators <code>S_i</code> with relations <code>(S_i)^2 = (S_i S_j)^18 =</code> I.
 * @author Sean A. Irvine
 */
public class A168736 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168736() {
    super(new long[] {-45, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9}, new long[] {11, 110, 1100, 11000, 110000, 1100000, 11000000, 110000000, 1100000000, 11000000000L, 110000000000L, 1100000000000L, 11000000000000L, 110000000000000L, 1100000000000000L, 11000000000000000L, 110000000000000000L, 1099999999999999945L}, 1);
  }
}
