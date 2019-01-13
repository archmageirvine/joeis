package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126641.
 * @author Sean A. Irvine
 */
public class A126641 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126641() {
    super(new long[] {120, -274, 225, -85, 15}, new long[] {9, 73, 537, 3625, 22809});
  }
}
