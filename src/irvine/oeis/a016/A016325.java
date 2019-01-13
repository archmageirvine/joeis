package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016325.
 * @author Sean A. Irvine
 */
public class A016325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016325() {
    super(new long[] {220, -152, 23}, new long[] {1, 23, 377});
  }
}
