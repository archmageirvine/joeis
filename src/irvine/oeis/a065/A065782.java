package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065782 a(1) = 36; for n &gt; 1, a(n) is the smallest square &gt; a(n-1) with a(n-1) forming its final digits.
 * @author Sean A. Irvine
 */
public class A065782 extends A065776 {

  /** Construct the sequence. */
  public A065782() {
    super(Z.valueOf(36));
  }
}
