package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016749 <code>a(n) = (2*n)^9</code>.
 * @author Sean A. Irvine
 */
public class A016749 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016749() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 512, 262144, 10077696, 134217728, 1000000000, 5159780352L, 20661046784L, 68719476736L, 198359290368L});
  }
}
