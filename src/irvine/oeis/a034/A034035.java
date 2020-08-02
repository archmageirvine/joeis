package irvine.oeis.a034;

import irvine.oeis.ComplementSequence;

/**
 * A034035 Not of form <code>(x^2+xy+2y^2</code> with <code>x &gt;= 0, y &gt;= 0)</code>.
 * @author Sean A. Irvine
 */
public class A034035 extends ComplementSequence {

  /** Construct the sequence. */
  public A034035() {
    super(new A034036());
  }
}
