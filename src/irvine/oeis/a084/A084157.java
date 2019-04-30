package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084157 <code>a(n)=8a(n-1)-16a(n-2)+12a(n-4); a(0)=0, a(1)=1, a(2)=4, a(3)=22</code>.
 * @author Sean A. Irvine
 */
public class A084157 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084157() {
    super(new long[] {12, 0, -16, 8}, new long[] {0, 1, 4, 22});
  }
}
