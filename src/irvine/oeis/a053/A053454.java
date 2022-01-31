package irvine.oeis.a053;

import irvine.oeis.transform.InverseEulerTransform;

/**
 * A053454 Number of weakly connected digraphs with n arcs.
 * @author Sean A. Irvine
 */
public class A053454 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A053454() {
    super(new A053418(), 1);
    next();
  }
}
