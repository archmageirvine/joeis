package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168193 <code>a(n) = a(n-1) + a(n-2) + 4</code>, with <code>a(0)=0, a(1)=2</code>.
 * @author Sean A. Irvine
 */
public class A168193 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168193() {
    super(new long[] {-1, 0, 2}, new long[] {0, 2, 6});
  }
}
