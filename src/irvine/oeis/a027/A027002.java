package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027002.
 * @author Sean A. Irvine
 */
public class A027002 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027002() {
    super(new long[] {-1, 9, -34, 71, -90, 71, -34, 9}, new long[] {1, 43, 431, 2482, 10636, 38138, 122069, 362853});
  }
}
