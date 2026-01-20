package irvine.oeis.a392;

import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002808;

/**
 * A392354 allocated for Aitzaz Imtiaz.
 * @author Sean A. Irvine
 */
public class A392354 extends FilterSequence {

  /** Construct the sequence. */
  public A392354() {
    super(1, new A002808(), c -> !c.subtract(1).sqrt().add(1).divide2().isProbablePrime());
  }
}

