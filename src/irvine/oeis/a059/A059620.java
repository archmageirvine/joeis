package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059620 Colors of the 88 keys of the standard piano: white keys <code>= 0</code>, black keys <code>= 1</code>.
 * @author Sean A. Irvine
 */
public class A059620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059620() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1});
  }
}
