package irvine.oeis.a339;

import irvine.oeis.transform.PairTransformSequence;

/**
 * A339293 Number of achiral series-parallel networks with n elements and without multiple unit elements in parallel.
 * @author Gregory Morse
 */
public class A339293 extends PairTransformSequence {
  /** Construct the sequence. */
  public A339293() {
    super(1, new A339291(), new A339292(), (n, u, v) -> u.add(v));
  }
}
