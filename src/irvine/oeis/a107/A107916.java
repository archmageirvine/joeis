package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107916.
 * @author Sean A. Irvine
 */
public class A107916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107916() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 30, 350, 2450, 12348, 49392, 166320, 490050, 1297725, 3149146, 7105098});
  }
}
