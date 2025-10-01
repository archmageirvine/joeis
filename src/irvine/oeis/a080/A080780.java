package irvine.oeis.a080;

import irvine.oeis.a079.A079000;

/**
 * A080780 a(1)=2; for n &gt; 1, a(n) is the smallest integer greater than a(n-1) consistent with the condition "n is in the sequence if and only if a(n) is congruent to 0 (mod 6)".
 * @author Sean A. Irvine
 */
public class A080780 extends A079000 {

  /** Construct the sequence. */
  public A080780() {
    super(1, 2, 0, n -> n.mod(6) == 0);
  }
}
