package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028209.
 * @author Sean A. Irvine
 */
public class A028209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028209() {
    super(new long[] {-5544, 2682, -473, 36}, new long[] {1, 36, 823, 15282});
  }
}
