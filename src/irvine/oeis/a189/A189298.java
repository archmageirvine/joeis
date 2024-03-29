package irvine.oeis.a189;
// Generated by gen_seq4.pl A189011 at 2021-09-19 21:23

import irvine.oeis.a008.A008586;
import irvine.oeis.a042.A042968;

/**
 * A189298 Zero-one sequence based on the sequence (4n):  a(A008586(k))=a(k); a(A042968(k))=1-a(k), a(1)=0, a(2)=1, a(3)=1.
 * @author Georg Fischer
 */
public class A189298 extends A189011 {

  /** Construct the sequence. */
  public A189298() {
    super(0, 1, new A008586(), new A042968(), 1, 0, 0);
  }
}
