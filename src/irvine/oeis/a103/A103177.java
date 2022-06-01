package irvine.oeis.a103;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A103177 (7*3^n + 2n + 5)/4.
 * @author Sean A. Irvine
 */
public class A103177 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103177() {
    super(new long[] {3, -7, 5}, new long[] {3, 7, 18});
  }
}
