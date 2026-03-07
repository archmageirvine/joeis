package irvine.oeis.a392;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a393.A393336;

/**
 * A392980 allocated for Paolo Xausa.
 * @author Sean A. Irvine
 */
public class A392980 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A392980() {
    super(1, 0, new A393336(), ZERO);
  }
}

