package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199688 <code>(8*10^n+1)/3</code>.
 * @author Sean A. Irvine
 */
public class A199688 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199688() {
    super(new long[] {-10, 11}, new long[] {3, 27});
  }
}
