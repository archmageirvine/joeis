package irvine.oeis.a204;
// Generated by gen_seq4.pl A204892/parm4 at 2022-05-02 19:06

import irvine.oeis.a000.A000045;

/**
 * A204926 Least Fibonacci number f such that n divides f-g for some Fibonacci number g satisfying g &lt; f.
 * @author Georg Fischer
 */
public class A204926 extends A204892 {

  /** Construct the sequence. */
  public A204926() {
    super(new A000045().skip(1), 0, 3);
  }
}
