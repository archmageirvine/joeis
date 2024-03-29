package irvine.oeis.a015;
// Generated by gen_seq4.pl mult3/mult at 2022-07-19 22:09

import irvine.oeis.MultiplicativeSequence;

/**
 * A015053 Smallest positive integer for which n divides a(n)^6.
 * @author Georg Fischer
 */
public class A015053 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A015053() {
    super(1, (p, e) -> p.pow((e + 5) / 6));
  }
}
