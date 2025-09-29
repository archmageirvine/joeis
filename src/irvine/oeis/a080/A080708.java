package irvine.oeis.a080;

import irvine.oeis.a079.A079000;

/**
 * A080708 a(1)=5; for n&gt;1, a(n) = smallest number &gt; a(n-1) such that the condition "n is in the sequence if and only if a(n) is a multiple of 4" is satisfied.
 * @author Sean A. Irvine
 */
public class A080708 extends A079000 {

  /** Construct the sequence. */
  public A080708() {
    super(1, 5, 0, n -> n.mod(4) == 0);
  }
}
