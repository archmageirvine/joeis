package irvine.oeis.a049;
// manually 2020-12-30

import irvine.oeis.HolonomicRecurrence;

/**
 * A049401 Number of Young tableaux of height &lt;= 5.
 * <code>n&lt;3, [1, 1, 2][n+1], ((3*n^2+17*n+15)*a(n-1)+(n-1)*(13*n+9)*a(n-2) -15*(n-1)*(n-2)*a(n-3)) / ((n+4)*(n+6))</code>
 * @author Georg Fischer
 */
public class A049401 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A049401() {
    super(0, "[[0],[-30, 45, -15],[-9, -4, 13],[15, 17, 3],[-24, -10, -1]]", "[1, 1, 2]", 0);
    //        [[0],[-30, 45, -15],[-9, -4, 13],[15, 17, 3],[-24, -10, -1]]
  }
}
