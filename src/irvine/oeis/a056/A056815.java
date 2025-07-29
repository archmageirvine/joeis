package irvine.oeis.a056;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A056815 Primes with prime "look and say" descriptions.
 * @author Sean A. Irvine
 */
public class A056815 extends FilterSequence {

  /** Construct the sequence. */
  public A056815() {
    super(1, new A000040(), k -> Functions.LOOK_AND_SAY.z(k).isProbablePrime());
  }
}

