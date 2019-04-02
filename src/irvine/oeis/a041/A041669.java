package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041669 Denominators of continued fraction convergents to sqrt(353).
 * @author Sean A. Irvine
 */
public class A041669 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041669() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 142528, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 4, 5, 14, 19, 33, 52, 85, 137, 222, 581, 803, 2990, 3793, 139538, 143331, 569531, 712862, 1995255, 2708117, 4703372, 7411489, 12114861, 19526350, 31641211, 82808772, 114449983, 426158721, 540608704});
  }
}
