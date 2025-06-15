package irvine.oeis.a077;

import irvine.oeis.a107.A107649;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077781.
 * @author Sean A. Irvine
 */
public class A077795 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077795() {
    super(1, new A107649(), k -> k.multiply2().add(1));
  }
}

