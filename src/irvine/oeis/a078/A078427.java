package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078427 Sum of all the decimal digits of numbers from 1 to <code>10^n</code>.
 * @author Sean A. Irvine
 */
public class A078427 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078427() {
    super(new long[] {100, -120, 21}, new long[] {46, 901, 13501});
  }
}
