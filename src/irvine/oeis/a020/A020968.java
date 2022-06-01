package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020968 Expansion of 1/((1-7*x)*(1-8*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A020968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020968() {
    super(new long[] {616, -221, 26}, new long[] {1, 26, 455});
  }
}
