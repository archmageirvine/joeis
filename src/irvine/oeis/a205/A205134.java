package irvine.oeis.a205;
// Generated by gen_seq4.pl A204892/parm4 at 2022-05-02 19:06

import irvine.oeis.a000.A000384;
import irvine.oeis.a204.A204892;

/**
 * A205134 s(k)-s(j), where (s(k),s(j)) is the least such pair for which n divides their difference, and s(j)=2*j^2-j, the j-th hexagonal number.
 * @author Georg Fischer
 */
public class A205134 extends A204892 {

  /** Construct the sequence. */
  public A205134() {
    super(new A000384(), 0, 5);
  }
}
