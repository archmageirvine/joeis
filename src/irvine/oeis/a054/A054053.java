package irvine.oeis.a054;

import irvine.oeis.transform.InverseEulerTransform;

/**
 * A054053 Number of nonisomorphic connected n-state automata with binary inputs and outputs.
 * @author Sean A. Irvine
 */
public class A054053 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A054053() {
    super(new A054052());
  }
}
