package irvine.oeis.a056;

import irvine.oeis.PositionSequence;
import irvine.oeis.PrependSequence;

/**
 * A056636.
 * @author Sean A. Irvine
 */
public class A056651 extends PositionSequence {

  /** Construct the sequence. */
  public A056651() {
    super(0, new PrependSequence(new A056649(), 0), 0);
  }
}
