package irvine.oeis.a080;

import irvine.oeis.a079.A079000;

/**
 * A080646 a(1) = 3; for n&gt;1, a(n) is taken to be the smallest integer greater than a(n-1) which is consistent with the condition "if n is a member of the sequence then a(n) is divisible by 3".
 * @author Sean A. Irvine
 */
public class A080646 extends A079000 {

  /** Construct the sequence. */
  public A080646() {
    super(1, 3, 1, n -> n.mod(4) == 0);
  }
}
