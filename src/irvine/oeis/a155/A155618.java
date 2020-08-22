package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155618 a(n) = 7^n+4^n-1^n.
 * @author Sean A. Irvine
 */
public class A155618 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155618() {
    super(new long[] {28, -39, 12}, new long[] {1, 10, 64});
  }
}
