package irvine.oeis.a034;

import irvine.oeis.a020.A020772;
import irvine.oeis.a157.A157697;

/**
 * A034988 a(n) is root of smallest square starting with a string of n 'digit_6's.
 * @author Sean A. Irvine
 */
public class A034988 extends A034982 {

  /** Construct the sequence. */
  public A034988() {
    super(new A020772(), new A157697(), "6", "");
  }
}
