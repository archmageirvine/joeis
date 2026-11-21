package irvine.oeis.a339;

import irvine.oeis.transform.PairTransformSequence;

/**
 * A339296 Number of unoriented series-parallel networks with n elements and without multiple unit elements in parallel.
 * @author Gregory Morse
 */
public class A339296 extends PairTransformSequence {
  /** Construct the sequence. */
  public A339296() {
    super(1, new A339290(), new A339293(), (n, u, v) -> u.add(v).divide2());
  }
}
