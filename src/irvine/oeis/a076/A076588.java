package irvine.oeis.a076;

import irvine.oeis.a032.A032523;
import irvine.oeis.a070.A070989;

/**
 * A076588 First occurrence of n as a term in the continued fraction for Pi/4.
 * @author Sean A. Irvine
 */
public class A076588 extends A032523 {

  /** Construct the sequence. */
  public A076588() {
    super(new A070989());
  }
}
