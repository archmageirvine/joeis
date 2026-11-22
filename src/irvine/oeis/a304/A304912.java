package irvine.oeis.a304;

import irvine.oeis.transform.EulerTransform;

/**
 * A304912 Number of non-isomorphic spanning hyperforests of weight n.
 * @author Gregory Morse
 */
public class A304912 extends EulerTransform {
  /** Construct the sequence. */
  public A304912() {
    super(new A304867().skip(), 1);
  }
}
