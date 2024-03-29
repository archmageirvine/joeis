package irvine.oeis.a322;
// Generated by gen_seq4.pl A099297/parmof5 at 2023-08-29 20:17

import irvine.oeis.a002.A002193;
import irvine.oeis.a099.A099297;

/**
 * A322647 Number of times the digit 6 appears in the first 10^n decimal digits of sqrt(2), sometimes called Pythagoras's constant, counting after the decimal point.
 * @author Georg Fischer
 */
public class A322647 extends A099297 {

  /** Construct the sequence. */
  public A322647() {
    super(1, new A002193().skip(1), 6, 10, 10);
  }
}
