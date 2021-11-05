package irvine.oeis.a052;

import irvine.oeis.a047.A047996;
import irvine.oeis.a048.A048807;

/**
 * A052313 Triangle read by rows: matrix square of A047996.
 * @author Sean A. Irvine
 */
public class A052313 extends A048807 {

  /** Construct the sequence. */
  public A052313() {
    super(new A047996());
  }
}
