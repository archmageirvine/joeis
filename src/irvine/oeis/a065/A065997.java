package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a007.A007691;

/**
 * A065997 Numbers n such that sigma(n) / n is prime.
 * @author Sean A. Irvine
 */
public class A065997 extends FilterSequence {

  /** Construct the sequence. */
  public A065997() {
    super(1, new A007691(), k -> Functions.SIGMA.z(k).divide(k).isProbablePrime());
  }
}
