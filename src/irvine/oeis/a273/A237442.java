package irvine.oeis.a273;

import irvine.oeis.a003.A003586;
import irvine.oeis.a395.A395530;

/**
 * A237442 a(n) is the least number of 3-smooth numbers that add up to n.
 * @author Sean A. Irvine
 */
public class A237442 extends A395530 {

  /** Construct the sequence. */
  public A237442() {
    super(new A003586());
  }
}
