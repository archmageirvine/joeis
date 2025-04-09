package irvine.oeis.a076;

import irvine.oeis.a013.A013679;
import irvine.oeis.a032.A032523;

/**
 * A076590 First occurrence of n as a term in the continued fraction for zeta(2)=Pi^2/6.
 * @author Sean A. Irvine
 */
public class A076590 extends A032523 {

  /** Construct the sequence. */
  public A076590() {
    super(new A013679());
  }
}
