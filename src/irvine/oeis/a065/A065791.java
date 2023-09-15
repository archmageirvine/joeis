package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065791 a(1) = 81; for n &gt; 1 is a(n) the smallest square &gt; a(n-1) with a(n-1) forming its final digits.
 * @author Sean A. Irvine
 */
public class A065791 extends A065776 {

  /** Construct the sequence. */
  public A065791() {
    super(Z.valueOf(81));
  }
}
