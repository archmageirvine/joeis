package irvine.oeis.a281;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A281858 Curious cubic identities based on the Armstrong number 370.
 * @author Sean A. Irvine
 */
public class A281858 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281858() {
    super(new long[] {1000000, -111000, 1110}, new long[] {370, 336700, 333667000});
  }
}
