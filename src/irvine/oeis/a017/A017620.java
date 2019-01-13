package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017620.
 * @author Sean A. Irvine
 */
public class A017620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017620() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {4096, 160000, 1048576, 3748096, 9834496});
  }
}
