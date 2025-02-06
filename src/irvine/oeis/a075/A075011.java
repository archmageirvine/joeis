package irvine.oeis.a075;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000422;
import irvine.oeis.a007.A007908;

/**
 * A053188.
 * @author Sean A. Irvine
 */
public class A075011 extends Combiner {

  /** Construct the sequence. */
  public A075011() {
    super(1, new A000422(), new A007908(), DIVIDE);
  }
}

