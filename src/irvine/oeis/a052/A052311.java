package irvine.oeis.a052;

import irvine.oeis.a047.A047996;
import irvine.oeis.a048.A048805;

/**
 * A052311 Triangle: Matrix inverse of A047996.
 * @author Sean A. Irvine
 */
public class A052311 extends A048805 {

  /** Construct the sequence. */
  public A052311() {
    super(new A047996());
  }
}
