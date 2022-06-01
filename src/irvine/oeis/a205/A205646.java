package irvine.oeis.a205;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A205646 Number of empty faces in Freij's family of Hansen polytopes.
 * @author Sean A. Irvine
 */
public class A205646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A205646() {
    super(new long[] {-3, 4}, new long[] {17, 19});
  }
}
