package irvine.oeis.a392;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A392348 allocated for Aitzaz Imtiaz.
 * @author Sean A. Irvine
 */
public class A392348 extends FilterSequence {

  /** Construct the sequence. */
  public A392348() {
    super(1, new A000040(), p -> !p.subtract(1).sqrt().add(1).divide2().isProbablePrime());
  }
}

