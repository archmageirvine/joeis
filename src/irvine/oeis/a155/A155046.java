package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155046 List of pairs: first pair is <code>(1,1)</code>; then follow <code>(x,y)</code> with <code>(x+2y, x+y)</code>.
 * @author Sean A. Irvine
 */
public class A155046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155046() {
    super(new long[] {1, 0, 2, 0}, new long[] {1, 1, 3, 2});
  }
}
