package irvine.oeis.a161;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A161204 a(0)=2. a(n+1) = 2*a(n) + period 4: repeat -5,1,3,1.
 * @author Sean A. Irvine
 */
public class A161204 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161204() {
    super(new long[] {2, 1, 1, 1}, new long[] {2, -1, -1, 1});
  }
}
