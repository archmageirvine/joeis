package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042342 Numerators of continued fraction convergents to <code>sqrt(698)</code>.
 * @author Sean A. Irvine
 */
public class A042342 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042342() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 10198, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {26, 53, 132, 185, 317, 502, 819, 2140, 5099, 267288, 539675, 1346638, 1886313, 3232951, 5119264, 8352215, 21823694, 51999603});
  }
}
