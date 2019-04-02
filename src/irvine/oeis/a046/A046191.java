package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046191 Indices of hexagonal numbers which are also octagonal.
 * @author Sean A. Irvine
 */
public class A046191 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046191() {
    super(new long[] {1, -99, 99}, new long[] {1, 77, 7521});
  }
}
