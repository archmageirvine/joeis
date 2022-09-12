package irvine.oeis.a048;

import irvine.oeis.a002.A002211;
import irvine.oeis.a059.A059101;

/**
 * A048613 Number of terms (excluding the first) of A002211 for which the geometric mean produces progressively better approximations to Khinchin's constant (itself).
 * @author Sean A. Irvine
 */
public class A048613 extends A059101 {

  /** Construct the sequence. */
  public A048613() {
    super(new A002211());
  }
}

