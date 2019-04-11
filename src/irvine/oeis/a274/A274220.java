package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274220 <code>a(n) =</code> (-cos(Pi/7)/cos(2*Pi/7))^n + (-cos(2*Pi/7)/cos(3*Pi/7))^n + (cos(3*Pi/7)/cos(Pi/7))^n.
 * @author Sean A. Irvine
 */
public class A274220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274220() {
    super(new long[] {1, -3, -4}, new long[] {3, -4, 10});
  }
}
