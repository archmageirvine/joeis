package irvine.oeis.a076;

import irvine.oeis.a016.A016731;
import irvine.oeis.a032.A032523;

/**
 * A076593 First occurrence of n as a term in the continued fraction for log(3).
 * @author Sean A. Irvine
 */
public class A076593 extends A032523 {

  /** Construct the sequence. */
  public A076593() {
    super(new A016731());
  }
}
