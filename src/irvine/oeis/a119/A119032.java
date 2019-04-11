package irvine.oeis.a119;

import irvine.oeis.LinearRecurrence;

/**
 * A119032 <code>a(n+2)=18a(n+1)-a(n)+8</code>.
 * @author Sean A. Irvine
 */
public class A119032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119032() {
    super(new long[] {1, -19, 19}, new long[] {0, 9, 170});
  }
}
