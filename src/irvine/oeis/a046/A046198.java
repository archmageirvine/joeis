package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046198 Indices of heptagonal numbers <code>(A000566)</code> which are also pentagonal.
 * @author Sean A. Irvine
 */
public class A046198 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046198() {
    super(new long[] {1, -63, 63}, new long[] {1, 42, 2585});
  }
}
