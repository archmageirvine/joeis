package irvine.oeis.a059;

import irvine.oeis.Combiner;

/**
 * A059790 Distance between 2*(n-th prime) and nearest prime.
 * @author Sean A. Irvine
 */
public class A059790 extends Combiner {

  /** Construct the sequence. */
  public A059790() {
    super(0, new A059787(), new A059789(), MIN);
  }
}
