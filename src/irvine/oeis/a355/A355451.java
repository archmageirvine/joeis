package irvine.oeis.a355;
// Generated by gen_seq4.pl charf

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a005.A005277;

/**
 * A355451 a(n) = 1 if n is even and phi(x) = n has no solutions, otherwise 0.
 * @author Georg Fischer
 */
public class A355451 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A355451() {
    super(1, new A005277(), true, 4);
  }
}
