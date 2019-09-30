package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001285;

/**
 * A026430 <code>a(n)</code> is the sum of first n terms of <code>A001285 (Thue-Morse</code> sequence).
 * @author Sean A. Irvine
 */
public class A026430 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026430() {
    super(new PrependSequence(new A001285(), 0));
  }
}
