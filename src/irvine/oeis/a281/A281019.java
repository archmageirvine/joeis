package irvine.oeis.a281;
// manually deris/partprod at 2022-04-28 15:40

import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a051.A051953;

/**
 * A281019 future sequence
 * @author Georg Fischer
 */
public class A281019 extends PartialProductSequence {

  /** Construct the sequence. */
  public A281019() {
    super(new PrependSequence(1, new A051953(), 1));
  }
}
