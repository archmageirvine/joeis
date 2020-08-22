package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016876 (5n+2)^4.
 * @author Sean A. Irvine
 */
public class A016876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016876() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {16, 2401, 20736, 83521, 234256});
  }
}
