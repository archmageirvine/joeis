package irvine.oeis.a076;

import irvine.oeis.a016.A016730;
import irvine.oeis.a032.A032523;

/**
 * A076592 First occurrence of n as a term in the continued fraction for log(2).
 * @author Sean A. Irvine
 */
public class A076592 extends A032523 {

  /** Construct the sequence. */
  public A076592() {
    super(new A016730());
  }
}
