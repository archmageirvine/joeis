package irvine.oeis.a280;
// manually deris/partprod at 2022-04-28 15:40

import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a024.A024816;

/**
 * A280982 Partial products of A024816; a(1) = a(2) = 1.
 * @author Georg Fischer
 */
public class A280982 extends PartialProductSequence {

  /** Construct the sequence. */
  public A280982() {
    super(1, new PrependSequence(2, new A024816(), 1, 1));
  }
}
