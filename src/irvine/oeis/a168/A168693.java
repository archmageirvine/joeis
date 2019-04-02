package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168693 Number of reduced words of length n in Coxeter group on 16 generators S_i with relations (S_i)^2 = (S_i S_j)^17 = I.
 * @author Sean A. Irvine
 */
public class A168693 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168693() {
    super(new long[] {-105, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14}, new long[] {1, 16, 240, 3600, 54000, 810000, 12150000, 182250000, 2733750000L, 41006250000L, 615093750000L, 9226406250000L, 138396093750000L, 2075941406250000L, 31139121093750000L, 467086816406250000L, 7006302246093750000L});
  }
}
