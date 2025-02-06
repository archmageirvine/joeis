package irvine.oeis.a075;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000422;
import irvine.oeis.a007.A007908;

/**
 * A075011 Floor[ concatenation of numbers from n to 1 divided by concatenation of numbers from 1 to n].
 * @author Sean A. Irvine
 */
public class A075011 extends Combiner {

  /** Construct the sequence. */
  public A075011() {
    super(1, new A000422(), new A007908(), DIVIDE);
  }
}

