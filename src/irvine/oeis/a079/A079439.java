package irvine.oeis.a079;

import irvine.oeis.a057.A057545;
import irvine.oeis.a071.A071661;

/**
 * A079439 Longest cycle in range [A014137(n-1)..A014138(n-1)] of permutation A071661.
 * @author Sean A. Irvine
 */
public class A079439 extends A057545 {

  /** Construct the sequence. */
  public A079439() {
    super(new A071661());
  }
}
