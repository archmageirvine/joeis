package irvine.oeis.a392;

import irvine.oeis.a002.A002277;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A392833 Cube of 3, then 33, then 333, increasing the number of threes by one each time.
 * @author Sean A. Irvine
 */
public class A392833 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A392833() {
    super(1, new A002277().skip(), k -> k.pow(3));
  }
}
