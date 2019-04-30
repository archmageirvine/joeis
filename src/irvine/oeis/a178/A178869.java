package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178869 <code>a(n) = 9*a(n-1) - 10*a(n-2); a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A178869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178869() {
    super(new long[] {-10, 9}, new long[] {0, 1});
  }
}
