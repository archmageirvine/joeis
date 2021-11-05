package irvine.oeis.a052;

import irvine.oeis.a048.A048807;
import irvine.oeis.a051.A051168;

/**
 * A052314 Triangle: Matrix square of A051168.
 * @author Sean A. Irvine
 */
public class A052314 extends A048807 {

  /** Construct the sequence. */
  public A052314() {
    super(new A051168());
  }
}
