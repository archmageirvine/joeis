package irvine.oeis.a352;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A352385 G.f. A(x) satisfies: A(x)^3 = (1-x) * (A(x) + x)^2.
 * @author Georg Fischer
 */
public class A352385 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A352385() {
    super(0, "[[0],[-276,161,-23],[246,-208,42],[-30,41,-15],[0,6,-4]]", "1,1,-3", 0);
  }
}
