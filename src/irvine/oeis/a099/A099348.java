package irvine.oeis.a099;
// Generated by gen_seq4.pl A099297/parmof5 at 2023-08-29 20:17

import irvine.oeis.a062.A062964;

/**
 * A099348 Frequency of the hexadecimal F in the first 10^n hexadecimal digits of Pi.
 * @author Georg Fischer
 */
public class A099348 extends A099297 {

  /** Construct the sequence. */
  public A099348() {
    super(1, new A062964().skip(1), 15, 10, 10);
  }
}
