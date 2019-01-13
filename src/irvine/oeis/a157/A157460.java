package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157460.
 * @author Sean A. Irvine
 */
public class A157460 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157460() {
    super(new long[] {1, -483, 483}, new long[] {0, 88, 42504});
  }
}
