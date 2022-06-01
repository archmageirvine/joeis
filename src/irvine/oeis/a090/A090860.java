package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090860 Number of ways of 4-coloring a map in which there is a central circle surrounded by an annulus divided into n-1 regions. There are n regions in all.
 * @author Sean A. Irvine
 */
public class A090860 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090860() {
    super(new long[] {2, 1}, new long[] {24, 72});
  }
}
