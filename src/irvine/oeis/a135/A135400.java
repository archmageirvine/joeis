package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135400.
 * @author Sean A. Irvine
 */
public class A135400 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135400() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 17, 108, 382, 995});
  }
}
