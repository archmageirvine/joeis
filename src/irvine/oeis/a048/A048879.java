package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048879 Generalized Pellian with second term of 10.
 * @author Sean A. Irvine
 */
public class A048879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048879() {
    super(new long[] {1, 4}, new long[] {1, 10});
  }
}
