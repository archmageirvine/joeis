package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046184 Indices of octagonal numbers which are also square.
 * @author Sean A. Irvine
 */
public class A046184 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046184() {
    super(new long[] {1, -15, 15}, new long[] {1, 9, 121});
  }
}
