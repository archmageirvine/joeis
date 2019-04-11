package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164591 <code>a(n) = ((4 + sqrt(18))*(4 + sqrt(8))^n + (4 - sqrt(18))*(4 - sqrt(8))^n)/8 </code>.
 * @author Sean A. Irvine
 */
public class A164591 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164591() {
    super(new long[] {-8, 8}, new long[] {1, 7});
  }
}
