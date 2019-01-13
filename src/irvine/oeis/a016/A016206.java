package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016206.
 * @author Sean A. Irvine
 */
public class A016206 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016206() {
    super(new long[] {22, -35, 14}, new long[] {1, 14, 161});
  }
}
