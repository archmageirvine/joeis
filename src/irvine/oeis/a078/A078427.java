package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078427 Sum of all the decimal digits of numbers from 1 to 10^n.
 * @author Sean A. Irvine
 */
public class A078427 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078427() {
    super(1, new long[] {100, -120, 21}, new long[] {46, 901, 13501});
  }
}
