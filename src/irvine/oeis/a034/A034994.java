package irvine.oeis.a034;

import irvine.oeis.a010.A010467;
import irvine.oeis.a010.A010734;

/**
 * A034994 Square root of smallest square starting with a string of n 9's.
 * @author Sean A. Irvine
 */
public class A034994 extends A034982 {

  /** Construct the sequence. */
  public A034994() {
    super(new A010734(), new A010467(), "9", "");
  }
}
