package irvine.oeis.a081;

import irvine.oeis.PrependSequence;
import irvine.oeis.a004.A004144;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A081324 Twice a square but not the sum of 2 distinct squares.
 * @author Sean A. Irvine
 */
public class A081324 extends PrependSequence {

  /** Construct the sequence. */
  public A081324() {
    super(1, new SimpleTransformSequence(new A004144(), k -> k.square().multiply2()), 0);
  }
}

