package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005322;

/**
 * A026134 <code>Sum{T(k,k-1)}, k = 1,2,...,n</code>, where T is the array in <code>A026120</code>.
 * @author Sean A. Irvine
 */
public class A026134 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026134() {
    super(new PrependSequence(new A005322(), 0));
  }
}
