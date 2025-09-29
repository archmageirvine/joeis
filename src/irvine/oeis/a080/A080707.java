package irvine.oeis.a080;

import irvine.oeis.a079.A079000;

/**
 * A080707 a(1)=5; for n&gt;1, a(n) = smallest number &gt; a(n-1) such that the condition "n is in the sequence if and only if a(n) is a multiple of 3" is satisfied.
 * @author Sean A. Irvine
 */
public class A080707 extends A079000 {

  /** Construct the sequence. */
  public A080707() {
    super(1, 5, 0, n -> n.mod(3) == 0);
  }
}
