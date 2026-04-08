package irvine.oeis.a394;

import irvine.oeis.gf.EgfSequence;

/**
 * A394644 allocated for Lorenzo Sauras Altuzarra.
 * @author Sean A. Irvine
 */
public class A394644 extends EgfSequence {

  /** Construct the sequence. */
  public A394644() {
    super(0, "exp(x+(4/3)*x^3)");
  }
}
