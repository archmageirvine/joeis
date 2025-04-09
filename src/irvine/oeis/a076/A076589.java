package irvine.oeis.a076;

import irvine.oeis.a032.A032523;
import irvine.oeis.a058.A058280;

/**
 * A076589 First occurrence of n as a term in the continued fraction for sqrt(Pi).
 * @author Sean A. Irvine
 */
public class A076589 extends A032523 {

  /** Construct the sequence. */
  public A076589() {
    super(new A058280());
  }
}
