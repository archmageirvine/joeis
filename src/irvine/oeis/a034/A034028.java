package irvine.oeis.a034;

import irvine.oeis.ComplementSequence;

/**
 * A034028 Numbers n not of form (x^2+2y^2 with x &gt;= y &gt;= 0).
 * @author Sean A. Irvine
 */
public class A034028 extends ComplementSequence {

  /** Construct the sequence. */
  public A034028() {
    super(new A034027());
  }
}
