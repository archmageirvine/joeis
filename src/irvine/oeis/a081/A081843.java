package irvine.oeis.a081;
// Generated by gen_seq4.pl build/parmof4 at 2022-12-30 21:44

import irvine.oeis.a064.A064437;

/**
 * A081843 a(1)=0, a(n)=a(n-1)+5 if n is already in the sequence, a(n)=a(n-1)+4 otherwise.
 * @author Georg Fischer
 */
public class A081843 extends A064437 {

  /** Construct the sequence. */
  public A081843() {
    super(1, 0, +5, +4);
  }
}
