package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001285;

/**
 * A026430 a(n) is the sum of first n terms of A001285 (Thue-Morse sequence).
 * @author Sean A. Irvine
 */
public class A026430 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026430() {
    super(new PrependSequence(new A001285(), 0));
  }
}
