package irvine.oeis.a205;
// Generated by gen_seq4.pl A204892/parm4 at 2022-05-02 19:06

import irvine.oeis.a002.A002378;
import irvine.oeis.a204.A204892;

/**
 * A205032 a(n) = (s(k)-s(j))/n, where (s(k),s(j)) is the least pair of oblong numbers (A002378) for which n divides their difference; a(n) = (1/n)*A205031(n).
 * @author Georg Fischer
 */
public class A205032 extends A204892 {

  /** Construct the sequence. */
  public A205032() {
    super(new A002378(), 0, 6);
  }
}
