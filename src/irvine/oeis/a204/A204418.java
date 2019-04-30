package irvine.oeis.a204;

import irvine.oeis.LinearRecurrence;

/**
 * A204418 Periodic sequence <code>1,0,1,... </code>, arranged in a triangle.
 * @author Sean A. Irvine
 */
public class A204418 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204418() {
    super(new long[] {1, 0, 0}, new long[] {1, 0, 1});
  }
}
