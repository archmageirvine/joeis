package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026044 <code>a(n) = (d(n)-r(n))/2</code>, where d = A026043 and r is the periodic sequence with fundamental period <code>(1,1,0,0)</code>.
 * @author Sean A. Irvine
 */
public class A026044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026044() {
    super(new long[] {-1, 4, -7, 8, -7, 4}, new long[] {22, 33, 49, 70, 97, 132});
  }
}
