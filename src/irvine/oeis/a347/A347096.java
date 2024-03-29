package irvine.oeis.a347;
// Generated by gen_seq4.pl deris/dirichinv at 2021-12-09 22:52
// DO NOT EDIT here!

import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a341.A341512;

/**
 * A347096 a(1) = 1; a(n) = -Sum_{d|n, d &lt; n} A341512(n/d) * a(d), where A341512(n) = sigma(n)*A003961(n) - n*sigma(A003961(n)).
 * @author Georg Fischer
 */
public class A347096 extends DirichletInverseSequence {

  /** Construct the sequence. */
  public A347096() {
    super(new A341512());
  }
}
