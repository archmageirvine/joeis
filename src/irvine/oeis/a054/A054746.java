package irvine.oeis.a054;

import irvine.oeis.transform.InverseEulerTransform;

/**
 * A054746 Number of nonisomorphic connected binary n-state automata without output under input permutations.
 * @author Sean A. Irvine
 */
public class A054746 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A054746() {
    super(new A054745(), 1);
    next();
  }
}
