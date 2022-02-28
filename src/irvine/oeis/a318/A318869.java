package irvine.oeis.a318;

import irvine.oeis.a122.A122082;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A318869 Inverse Euler transform of A122082.
 * @author Sean A. Irvine
 */
public class A318869 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A318869() {
    super(new A122082(), 1);
  }
}
