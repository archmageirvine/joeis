package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168923 Number of reduced words of length n in Coxeter group on 6 generators S_i with relations (S_i)^2 = (S_i S_j)^22 = I.
 * @author Sean A. Irvine
 */
public class A168923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168923() {
    super(new long[] {-10, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, new long[] {1, 6, 30, 150, 750, 3750, 18750, 93750, 468750, 2343750, 11718750, 58593750, 292968750, 1464843750, 7324218750L, 36621093750L, 183105468750L, 915527343750L, 4577636718750L, 22888183593750L, 114440917968750L, 572204589843750L});
  }
}
