package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286778.
 * @author Sean A. Irvine
 */
public class A286778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286778() {
    super(new long[] {-16, 36, -28, 9}, new long[] {0, 2, 22, 142});
  }
}
