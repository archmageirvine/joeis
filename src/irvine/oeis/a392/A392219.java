package irvine.oeis.a392;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A392038.
 * @author Sean A. Irvine
 */
public class A392219 extends FilterSequence {

  /** Construct the sequence. */
  public A392219() {
    super(1, new A000040(), p -> p.subtract(1).sqrt().add(1).divide2().isProbablePrime());
  }
}

