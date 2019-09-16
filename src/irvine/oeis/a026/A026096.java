package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;

/**
 * A026096 <code>Sum{T(n,k)}, k = 0,1,...,n</code>, where T is the array defined in <code>A026082</code>.
 * @author Sean A. Irvine
 */
public class A026096 extends PrependSequence {

  /** Construct the sequence. */
  public A026096() {
    super(new DifferenceSequence(new SkipSequence(new A026080(), 3)), 2, 4, 8);
  }
}

