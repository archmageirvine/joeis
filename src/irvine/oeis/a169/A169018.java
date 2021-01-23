package irvine.oeis.a169;

import irvine.oeis.LinearRecurrence;

/**
 * A169018 Number of reduced words of length n in Coxeter group on 5 generators S_i with relations (S_i)^2 = (S_i S_j)^24 = I.
 * @author Sean A. Irvine
 */
public class A169018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169018() {
    super(new long[] {-6, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, new long[] {1, 5, 20, 80, 320, 1280, 5120, 20480, 81920, 327680, 1310720, 5242880, 20971520, 83886080, 335544320, 1342177280, 5368709120L, 21474836480L, 85899345920L, 343597383680L, 1374389534720L, 5497558138880L, 21990232555520L, 87960930222080L});
  }
}
