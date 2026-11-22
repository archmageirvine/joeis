package irvine.oeis.a191;

import irvine.oeis.a322.A322114;

/**
 * A191646 Triangle read by rows: T(n,k) = number of connected multigraphs with n &gt;= 0 edges and 1 &lt;= k &lt;= n+1 vertices, with no loops allowed.
 * @author Gregory Morse
 */
public class A191646 extends A322114 {
  /** Construct the sequence. */
  public A191646() {
    super(false, true);
  }
}
