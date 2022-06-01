package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145302 a(n) = ((7 + sqrt(7))^n + (7 - sqrt(7))^n)/2.
 * @author Sean A. Irvine
 */
public class A145302 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145302() {
    super(new long[] {-42, 14}, new long[] {1, 7});
  }
}
