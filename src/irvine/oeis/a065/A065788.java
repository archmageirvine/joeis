package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065788 a(1) = 64; for n &gt; 1 a(n) is the smallest square &gt; a(n-1) with a(n-1) forming its final digits.
 * @author Sean A. Irvine
 */
public class A065788 extends A065776 {

  /** Construct the sequence. */
  public A065788() {
    super(Z.valueOf(64));
  }
}
