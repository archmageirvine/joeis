package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;

/**
 * A026163 Sum{T(k,k-1)}, k = 1,2,...,n, where T is the array in A026148.
 * @author Sean A. Irvine
 */
public class A026163 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026163() {
    super(new PrependSequence(new A026152(), 1));
  }
}
