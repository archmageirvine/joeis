package irvine.oeis.a076;

import irvine.oeis.a002.A002945;
import irvine.oeis.a032.A032523;

/**
 * A076595 First occurrence of n as a term in the continued fraction for the cube root of 2.
 * @author Sean A. Irvine
 */
public class A076595 extends A032523 {

  /** Construct the sequence. */
  public A076595() {
    super(new A002945());
  }
}
