package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094629 Erroneous version of A052216.
 * @author Sean A. Irvine
 */
public class A094629 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094629() {
    super(new long[] {10, 0}, new long[] {2, 11});
  }
}
