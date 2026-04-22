package irvine.oeis.a023;

import irvine.math.cr.CR;

/**
 * A023129 Signature sequence of sqrt(e).
 * @author Sean A. Irvine
 */
public class A023129 extends A023117 {

  /** Construct the sequence. */
  public A023129() {
    super(CR.E.sqrt());
  }
}
