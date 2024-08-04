package irvine.oeis.a071;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A071696 Greater members of twin prime pairs of form (4*k+1,4*k+3), k&gt;0.
 * @author Sean A. Irvine
 */
public class A071696 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A071696() {
    super(new A071695(), p -> p.add(2));
  }
}
