package irvine.oeis.a053;

import irvine.oeis.transform.InverseEulerTransform;

/**
 * A053447.
 * @author Sean A. Irvine
 */
public class A053454 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A053454() {
    super(new A053418(), 1);
    next();
  }
}
