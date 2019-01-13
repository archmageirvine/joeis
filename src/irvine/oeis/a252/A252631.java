package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252631.
 * @author Sean A. Irvine
 */
public class A252631 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252631() {
    super(new long[] {1, -323, 323}, new long[] {92, 29524, 9506540});
  }
}
