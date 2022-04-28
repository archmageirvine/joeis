package irvine.oeis.a161;
// manually deris/essent at 2022-04-28 12:39

import irvine.oeis.PrependSequence;
import irvine.oeis.a254.A254196;

/**
 * A161527 Numerators of cumulative sums of rational sequence A038110(k)/A038111(k).
 * @author Georg Fischer
 */
public class A161527 extends PrependSequence {

  /** Construct the sequence. */
  public A161527() {
    super(0, new A254196());
  }
}
