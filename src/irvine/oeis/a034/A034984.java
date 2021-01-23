package irvine.oeis.a034;

import irvine.oeis.a010.A010722;
import irvine.oeis.a195.A195284;

/**
 * A034984 a(n)^2 is smallest square starting with a string of n 4's.
 * @author Sean A. Irvine
 */
public class A034984 extends A034982 {

  /** Construct the sequence. */
  public A034984() {
    super(new A010722(), new A195284(), "4", "");
  }
}
