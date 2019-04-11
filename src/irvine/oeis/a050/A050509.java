package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050509 House numbers (version <code>2)</code>: <code>a(n) = (n+1)^3 +</code> (n+1)*Sum_{i=0..n} i.
 * @author Sean A. Irvine
 */
public class A050509 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050509() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 10, 36, 88});
  }
}
