package irvine.oeis.a137;
// manually ietman at 2023-02-08 22:11

import irvine.oeis.a052.A052171;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A137975 Row sums of A139621, number of connected directed multigraphs with loops and no vertex of degree 0, with n arcs.
 * @author Georg Fischer
 */
public class A137975 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A137975() {
    super(0, new A052171(), 1);
  }
}
