package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182089 Numbers of the form (330*k+7)*(660*k+13)*(990*k+19)*(1980*k+37).
 * @author Sean A. Irvine
 */
public class A182089 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182089() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {63973, 461574735553L, 7103999557333L, 35498632881313L, 111463190499493L});
  }
}
