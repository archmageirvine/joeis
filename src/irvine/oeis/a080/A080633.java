package irvine.oeis.a080;

import irvine.oeis.a079.A079000;

/**
 * A080633 a(1)=3; for n &gt; 1, a(n) is the smallest integer greater than a(n-1) consistent with the condition "n is in the sequence if and only if a(n) is congruent to 1 (mod 4)".
 * @author Sean A. Irvine
 */
public class A080633 extends A079000 {

  /** Construct the sequence. */
  public A080633() {
    super(1, 3, 4, n -> n.mod(4) == 1);
  }
}
