package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;

/**
 * A026163 <code>Sum{T(k,k-1)}, k = 1,2,...,n</code>, where T is the array in <code>A026148</code>.
 * @author Sean A. Irvine
 */
public class A026163 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026163() {
    super(new PrependSequence(new A026152(), 1));
  }
}
