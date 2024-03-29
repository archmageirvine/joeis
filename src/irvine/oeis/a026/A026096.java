package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;

/**
 * A026096 Sum{T(n,k)}, k = 0,1,...,n, where T is the array defined in A026082.
 * @author Sean A. Irvine
 */
public class A026096 extends PrependSequence {

  /** Construct the sequence. */
  public A026096() {
    super(new DifferenceSequence(new A026080().skip(3)), 2, 4, 8);
  }
}

