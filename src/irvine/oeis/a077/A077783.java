package irvine.oeis.a077;

import irvine.oeis.a107.A107125;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077781.
 * @author Sean A. Irvine
 */
public class A077783 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077783() {
    super(1, new A107125().skip(), k -> k.multiply2().add(1));
  }
}

