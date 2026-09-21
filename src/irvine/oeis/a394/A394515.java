package irvine.oeis.a394;

import irvine.oeis.gf.EgfSequence;

/**
 * A394515 allocated for Daniel Yaqubi.
 * @author Sean A. Irvine
 */
public class A394515 extends EgfSequence {

  /** Construct the sequence. */
  public A394515() {
    super(0, "(exp(x)-1)*(exp(exp(x)-1)-1)/(2-exp(x))");
  }
}

