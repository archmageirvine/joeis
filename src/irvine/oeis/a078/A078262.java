package irvine.oeis.a078;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000422;
import irvine.oeis.a007.A007908;

/**
 * A078262 Sum of the forward and reverse concatenations of 1 to n.
 * @author Sean A. Irvine
 */
public class A078262 extends Combiner {

  /** Construct the sequence. */
  public A078262() {
    super(new A000422(), new A007908(), ADD);
  }
}

