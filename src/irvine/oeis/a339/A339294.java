package irvine.oeis.a339;

import irvine.oeis.transform.PairTransformSequence;

/**
 * A339294 Number of essentially series unoriented series-parallel networks with n elements and without multiple unit elements in parallel.
 * @author Gregory Morse
 */
public class A339294 extends PairTransformSequence {
  /** Construct the sequence. */
  public A339294() {
    super(1, new A339288(), new A339291(), (n, u, v) -> u.add(v).divide2());
  }
}
