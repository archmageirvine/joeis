package irvine.oeis.a054;

import irvine.oeis.transform.InverseEulerTransform;

/**
 * A054742 Finite automata.
 * @author Sean A. Irvine
 */
public class A054742 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A054742() {
    super(new A054732());
  }
}
