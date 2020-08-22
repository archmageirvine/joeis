package irvine.oeis.a011;

import irvine.oeis.LinearRecurrence;

/**
 * A011916 a(n) = ((b(n)-1)+sqrt(3*b(n)^2-4*b(n)+1))/2, where b(n) is A011922(n).
 * @author Sean A. Irvine
 */
public class A011916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A011916() {
    super(new long[] {1, -15, 15}, new long[] {0, 3, 44});
  }
}
