package irvine.oeis.a076;

import irvine.oeis.a032.A032523;
import irvine.oeis.a053.A053300;

/**
 * A076587 First occurrence of n as a term in the continued fraction for Pi/2.
 * @author Sean A. Irvine
 */
public class A076587 extends A032523 {

  /** Construct the sequence. */
  public A076587() {
    super(new A053300());
  }
}
