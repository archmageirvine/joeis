package irvine.oeis.a102;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A102865 Base-4 digits are, in order, the first n terms of the sequence (1, 3, 21, 203, 2021, 20203, 202021, 2020203, 20202021, 202020203, ... ).
 * @author Sean A. Irvine
 */
public class A102865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102865() {
    super(new long[] {-4, 1, 4}, new long[] {1, 3, 9});
  }
}
