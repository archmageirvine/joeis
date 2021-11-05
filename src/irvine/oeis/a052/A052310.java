package irvine.oeis.a052;

import irvine.oeis.a048.A048807;

/**
 * A052310 Triangle read by rows: matrix square of A052307.
 * @author Sean A. Irvine
 */
public class A052310 extends A048807 {

  /** Construct the sequence. */
  public A052310() {
    super(new A052307());
  }
}
