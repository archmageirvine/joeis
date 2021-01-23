package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168737 Number of reduced words of length n in Coxeter group on 12 generators S_i with relations (S_i)^2 = (S_i S_j)^18 = I.
 * @author Sean A. Irvine
 */
public class A168737 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168737() {
    super(new long[] {-55, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, new long[] {12, 132, 1452, 15972, 175692, 1932612, 21258732, 233846052, 2572306572L, 28295372292L, 311249095212L, 3423740047332L, 37661140520652L, 414272545727172L, 4556998002998892L, 50126978032987812L, 551396758362865932L, 6065364341991525186L}, 1);
  }
}
