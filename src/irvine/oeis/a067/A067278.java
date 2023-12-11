package irvine.oeis.a067;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005589;

/**
 * A067278 a(n) = letters(n) + a(n-1); a(0) = 0.
 * @author Sean A. Irvine
 */
public class A067278 extends PartialSumSequence {

  /** Construct the sequence. */
  public A067278() {
    super(0, new PrependSequence(new A005589().skip(), 0));
  }
}
