package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099263.
 * @author Sean A. Irvine
 */
public class A099263 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099263() {
    super(new long[] {5760, -14832, 14756, -7504, 2135, -343, 29}, new long[] {1, 2, 5, 15, 52, 203, 877});
  }
}
