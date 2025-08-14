package irvine.oeis.a079;

import irvine.oeis.a057.A057507;
import irvine.oeis.a071.A071663;

/**
 * A079441 Number of cycles in range [A014137(n-1)..A014138(n-1)] of permutation A071663.
 * @author Sean A. Irvine
 */
public class A079441 extends A057507 {

  /** Construct the sequence. */
  public A079441() {
    super(new A071663());
  }
}
