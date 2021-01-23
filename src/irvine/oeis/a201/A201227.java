package irvine.oeis.a201;

import irvine.oeis.LinearRecurrence;

/**
 * A201227 a(n) = (A201225(n))^3 - (A201226(n))^2.
 * @author Sean A. Irvine
 */
public class A201227 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201227() {
    super(new long[] {1, -19, 19}, new long[] {219375, 4566375, 82569375});
  }
}
