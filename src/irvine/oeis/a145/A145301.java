package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145301 <code>a(n) = 12*a(n-1) - 30*a(n-2)</code> with <code>a(0)=1</code> and <code>a(1)=6</code>.
 * @author Sean A. Irvine
 */
public class A145301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145301() {
    super(new long[] {-30, 12}, new long[] {1, 6});
  }
}
