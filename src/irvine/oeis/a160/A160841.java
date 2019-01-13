package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160841.
 * @author Sean A. Irvine
 */
public class A160841 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160841() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 154, 2287, 14725, 61147, 193546, 509293});
  }
}
