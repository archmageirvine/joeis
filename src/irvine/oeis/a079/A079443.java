package irvine.oeis.a079;

import irvine.oeis.a057.A057545;
import irvine.oeis.a071.A071663;

/**
 * A079443 The longest cycle in range [A014137(n-1)..A014138(n-1)] of permutation A071663.
 * @author Sean A. Irvine
 */
public class A079443 extends A057545 {

  /** Construct the sequence. */
  public A079443() {
    super(new A071663());
  }
}
