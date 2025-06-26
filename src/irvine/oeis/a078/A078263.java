package irvine.oeis.a078;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000422;
import irvine.oeis.a007.A007908;

/**
 * A078263 Product of the forward and reverse concatenations of 1 to n.
 * @author Sean A. Irvine
 */
public class A078263 extends Combiner {

  /** Construct the sequence. */
  public A078263() {
    super(new A000422(), new A007908(), MULTIPLY);
  }
}

