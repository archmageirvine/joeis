package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016865.
 * @author Sean A. Irvine
 */
public class A016865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016865() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 7776, 161051, 1048576, 4084101, 11881376});
  }
}
