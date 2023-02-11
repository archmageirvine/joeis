package irvine.oeis.a054;

import irvine.oeis.transform.InverseEulerTransform;

/**
 * A054051 Number of nonisomorphic connected binary n-state automata.
 * @author Sean A. Irvine
 */
public class A054051 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A054051() {
    super(1, new A054050());
  }
}
