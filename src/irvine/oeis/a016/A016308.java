package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016308.
 * @author Sean A. Irvine
 */
public class A016308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016308() {
    super(new long[] {132, -100, 19}, new long[] {1, 19, 261});
  }
}
