package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131179 <code>a(n) =</code> if <code>n mod 2 == 0</code> then <code>n*(n+1)/2</code>, otherwise <code>(n-1)*n/2 + 1</code>.
 * @author Sean A. Irvine
 */
public class A131179 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131179() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 3, 4, 10});
  }
}
