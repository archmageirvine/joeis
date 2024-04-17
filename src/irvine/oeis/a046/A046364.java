package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a071.A071904;

/**
 * A046364 Odd numbers whose sum of prime factors is prime (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046364 extends FilterSequence {

  /** Construct the sequence. */
  public A046364() {
    super(0, new A071904(), k -> Functions.SOPFR.z(k).isProbablePrime());
  }
}
