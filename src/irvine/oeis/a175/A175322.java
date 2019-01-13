package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175322.
 * @author Sean A. Irvine
 */
public class A175322 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175322() {
    super(new long[] {1, -41, 246, -246, 41}, new long[] {12, 490, 17136, 584988, 19889100});
  }
}
