package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050509.
 * @author Sean A. Irvine
 */
public class A050509 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050509() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 10, 36, 88});
  }
}
