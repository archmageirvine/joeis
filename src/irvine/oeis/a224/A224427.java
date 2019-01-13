package irvine.oeis.a224;

import irvine.oeis.LinearRecurrence;

/**
 * A224427.
 * @author Sean A. Irvine
 */
public class A224427 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224427() {
    super(new long[] {-32, 64, -42, 11}, new long[] {343, 8967, 88679, 620839});
  }
}
