package irvine.oeis.a246;
// Generated by gen_seq4.pl charfun at 2023-09-18 22:41
// DO NOT EDIT here!

import irvine.oeis.CharacteristicFunction;

/**
 * A246260 a(n) = 1 if A003961(n) is of the form 4k+1, otherwise a(n) = 0, (when A003961(n) is of the form 4k+3). [A003961 is fully multiplicative with a(p) = nextprime(p)].
 * @author Georg Fischer
 */
public class A246260 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A246260() {
    super(1, new A246261());
  }
}
