package irvine.oeis.a066;

import irvine.oeis.a046.A046036;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A066811 Numbers k such that the concatenation of odd numbers from 1 to k is a prime.
 * @author Sean A. Irvine
 */
public class A066811 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A066811() {
    super(1, new A046036(), k -> k.multiply2().subtract(1));
  }
}

