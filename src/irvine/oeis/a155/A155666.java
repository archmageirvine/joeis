package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155666 9^n-8^n+1.
 * @author Sean A. Irvine
 */
public class A155666 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155666() {
    super(new long[] {72, -89, 18}, new long[] {1, 2, 18});
  }
}
