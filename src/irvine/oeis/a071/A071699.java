package irvine.oeis.a071;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A071699 Greater members of twin prime pairs of form (4*k+3, 4*k+5), k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A071699 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A071699() {
    super(new A071698(), p -> p.add(2));
  }
}
