package irvine.oeis.a118;

import irvine.oeis.a008.A008836;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.transform.NegationTransformSequence;

/**
 * A118205 Euler transform of the negative of the Liouville function.
 * @author Georg Fischer
 */
public class A118205 extends EulerTransform {

  /** Construct the sequence. */
  public A118205() {
    super(new NegationTransformSequence(new A008836()), 1);
  }
}
