package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259044 Period 8 sequence <code>[ 0, 1, 0, 1, 1, 1, 0, 1, </code>...].
 * @author Sean A. Irvine
 */
public class A259044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259044() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 0, 1, 1, 1, 0, 1});
  }
}
