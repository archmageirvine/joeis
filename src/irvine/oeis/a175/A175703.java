package irvine.oeis.a175;
// Generated by gen_seq4.pl rootet at 2023-02-21 22:24

import irvine.oeis.a007.A007947;
import irvine.oeis.transform.RootSequence;

/**
 * A175703 Convolution of A007947 with itself.
 * @author Georg Fischer
 */
public class A175703 extends RootSequence {

  /** Construct the sequence. */
  public A175703() {
    super(1, new A007947().skip(1), 2, 1);
  }
}
