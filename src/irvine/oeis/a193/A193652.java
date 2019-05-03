package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193652 <code>A020988</code> and <code>A007583</code> interleaved.
 * @author Sean A. Irvine
 */
public class A193652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193652() {
    super(new long[] {-4, 0, 5, 0}, new long[] {0, 1, 2, 3});
  }
}
